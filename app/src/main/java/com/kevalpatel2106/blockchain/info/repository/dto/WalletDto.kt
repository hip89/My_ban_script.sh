package com.kevalpatel2106.blockchain.info.repository.dto

import com.google.gson.annotations.SerializedName

data class WalletDto(

        @field:SerializedName("n_tx_filtered")
        val nTxFiltered: Long,

        @field:SerializedName("final_balance")
        val finalBalance: Long,

        @field:Serializ