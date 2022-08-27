package com.kevalpatel2106.blockchain.info.repository.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import java.io.IOException

@RunWith(JUnit4::class)
class OkHttpClientTest {
    private val baseUrl = "http://www.google.com"
    private lateinit var okHttpClient: OkHttpClient

    @Before
    fun setUp() {
        okHttpClient = Network(baseUrl, true).okHttpClient
    }

    @Test
    @Throws(IOException::class)
    fun `check read timeout`() {
        Assert.assertEquals(okHttpClient.readTimeoutMillis().toLong(), NetworkConfig.READ_TIMEOUT * 60 * 1000)
    }

    @Test
    @Throws(IOException::c