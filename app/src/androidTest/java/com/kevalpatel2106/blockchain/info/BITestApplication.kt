package com.kevalpatel2106.blockchain.info

import com.kevalpatel2106.blockchain.info.di.*
import com.kevalpatel2106.blockchain.info.utils.BaseApplication
import com.kevalpatel2106.testutils.MockServerManager
import java.io.IOException

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
internal class BITestApplication : BaseApplication() {

    var mockServerManager = MockServerManager()


    @Volatile
    private lateinit var mockServerBaseUrl: String

    override fun onCreate() {
        // Start the mock server
        val thread = object : Thread() {
            override fun run() {
                try {
                    mockServerManager.startMockWebServer()
                    mockServerBaseUrl =  mockServerManager.getBaseUrl()
  