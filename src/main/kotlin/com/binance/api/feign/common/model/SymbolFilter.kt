package com.binance.api.feign.common.model

data class SymbolFilter(
    val filterType: FilterType,
    val minPrice: String,
    val maxPrice: String,
    val tickSize: String,
    val minQty: String,
    val maxQty: String,
    val stepSize: String,
    val minNotional: String,
    val limit: String
)
