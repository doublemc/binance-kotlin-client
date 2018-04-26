package com.binance.api.feign.general.model

import com.binance.api.feign.common.model.SymbolInfo

data class ExchangeInfo(
    val timeZone: String,
    val serverTime: Long,
    val rateLimits: List<RateLimitInfo>,
    val symbols: List<SymbolInfo>
)