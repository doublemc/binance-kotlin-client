package com.binance.api.feign.general

import com.binance.api.feign.general.model.ExchangeInfo
import com.binance.api.feign.general.model.ServerTime
import feign.RequestLine

interface GeneralRestClient {
    @RequestLine("GET /api/v1/ping")
    fun ping()

    @RequestLine("GET /api/v1/time")
    fun getServerTime(): ServerTime

    @RequestLine("GET /api/v1/exchangeInfo")
    fun getExchangeInfo(): ExchangeInfo
}