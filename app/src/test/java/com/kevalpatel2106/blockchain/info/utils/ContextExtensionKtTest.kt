/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevalpatel2106.blockchain.info.utils

import android.content.Intent
import android.graphics.Color
import com.kevalpatel2106.blockchain.info.SplashActivity
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import org.robolectric.annotation.Config

/**
 * @author [kevalpatel2106](https://github.com/kevalpatel2106)
 */
@RunWith(RobolectricTestRunner::class)
@Config(sdk = [21], manifest = Config.NONE)
class ContextExtensionKtTest {

    @Test
    @Throws(Exception::class)
    fun testGetColor() {
        assertEquals(Color.WHITE, RuntimeEnvironment.application.getColorCompat(android.R.color.white))
    }


    @Test
    @Throws(Exception::class)
    fun checkPrepareLaunchIntent_InNewTask() {
        val launchIntent = RuntimeEnvironment.application
            .prepareLaunchInten