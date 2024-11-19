package com.jvrcoding.cryptotracker.crypto.presentation.coin_list

import com.jvrcoding.cryptotracker.crypto.presentation.models.CoinUi

interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi): CoinListAction
    data object OnRefresh: CoinListAction
}