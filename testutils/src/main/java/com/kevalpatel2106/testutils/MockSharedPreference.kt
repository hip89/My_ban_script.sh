
/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevalpatel2106.testutils

import android.content.SharedPreferences
import java.util.*


/**
 * Mock implementation of shared preference, which just saves data in memory using map.
 *
 * @see <a href="https://gist.github.com/amardeshbd/354173d00b988574ee5019c4ba0c8a0b">Reference</a>
 * @author <a href="https://github.com/kevalpatel2106">kevalpatel2106</a>
 */
class MockSharedPreference : SharedPreferences {

    private val preferenceMap: HashMap<String, Any?> = HashMap()
    private val preferenceEditor: MockSharedPreferenceEditor