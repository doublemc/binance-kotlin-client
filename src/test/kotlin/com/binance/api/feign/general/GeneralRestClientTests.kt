package com.binance.api.feign.general

import feign.Feign
import feign.gson.GsonDecoder
import io.kotlintest.matchers.beGreaterThan
import io.kotlintest.matchers.should
import io.kotlintest.specs.FeatureSpec

class GeneralRestClientTests : FeatureSpec() {
    init {
        val generalRestClient =
            Feign.builder()
                .decoder(GsonDecoder())
                .target(GeneralRestClient::class.java, "https://api.binance.com")

        feature("should ping without exception") {
            generalRestClient.ping()
        }

        feature("should return exchange info") {
            val (timeZone, serverTime, rateLimits, symbols) = generalRestClient.getExchangeInfo()
            serverTime should beGreaterThan(0L)
            rateLimits.size should beGreaterThan(0)
            symbols.size should beGreaterThan(0)
        }

        feature("should return server time") {
            val (serverTime) = generalRestClient.getServerTime()
            serverTime should beGreaterThan(0L)
        }
    }
}
