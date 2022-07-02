package com.kevalpatel2106.blockchain.info.bin

import com.kevalpatel2106.blockchain.info.utils.convertToBtc
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class TransactionTest {

    private val transaction1 = Transaction(0, 0, 0, 0, "0000000000000000005d6b64c157cb6879edf8d5a19dc1fe96ebb2a37a4d24a1")
    private val transaction2 = Transaction(0, 0, 0, 0, "hash2")
    private val transaction3 = Transaction(0, 0, 0, 0, "0000000000000000005d6b64c157cb6879edf8d5a19dc1fe96ebb2a37a4d24a1")


    @Test
    fun givenResultIsNegative_verifyTransactionIsDebit(){
        val