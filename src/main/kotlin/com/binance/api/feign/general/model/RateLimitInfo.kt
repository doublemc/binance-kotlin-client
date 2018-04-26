package com.binance.api.feign.general.model

data class RateLimitInfo(
    val rateLimitType: RateLimitType,
    val interval: RateLimitInterval,
    val limit: Int
)