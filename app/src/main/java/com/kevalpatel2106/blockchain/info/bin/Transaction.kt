package com.kevalpatel2106.blockchain.info.bin

import com.kevalpatel2106.blockchain.info.utils.convertToBtc

data class Transaction(
        val fee: Long,
        val result: Long,
        val balance: Long,
        val time: Long,
        val hash: String
) {
    override fun equals(other: Any?): Boolean = (other as? Transaction)?.hash == hash

    override fun hashCode(): Int = hash.hashCode()

    val formattedResult: String = result.run {
        if (this > 0) {
            "+${this} SAT"
        } else {
            "-${Math.abs(this)} SAT"
        }
    }

    val formattedFee: String = "$fee SAT"

    val formattedBalance: String = "${conver