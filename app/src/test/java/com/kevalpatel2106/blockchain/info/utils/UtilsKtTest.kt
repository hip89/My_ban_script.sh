package com.kevalpatel2106.blockchain.info.utils

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.math.roundToLong

@RunWith(Parameterized::class)
class UtilsKtTest(private val satoshi: Long, private val btc: Double){

    companion object {

      