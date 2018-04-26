package com.binance.api.feign.common.model

enum class SymbolStatus {
    PRE_TRADING,
    TRADING,
    POST_TRADING,
    END_OF_DAY,
    HALT,
    AUCTION_MATCH,
    BREAK
}
