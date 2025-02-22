package com.jvrcoding.cryptotracker.crypto.presentation.coin_list

import com.jvrcoding.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}