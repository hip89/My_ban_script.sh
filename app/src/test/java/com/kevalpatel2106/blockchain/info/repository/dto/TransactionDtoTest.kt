package com.kevalpatel2106.blockchain.info.repository.dto

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class TransactionDtoTest{

    @Test
    fun checkConversionToEntity(){
        val fee= 876L
        val balance= 4775L
        val result= 36745L
        val time= System.currentTimeMillis()
        val hash= "0