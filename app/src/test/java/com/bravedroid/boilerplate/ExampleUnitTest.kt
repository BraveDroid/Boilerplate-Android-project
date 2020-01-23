package com.bravedroid.boilerplate

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun `should Read the TWITTER_CONSUMER_KEY`() {
        assertEquals(BuildConfig.TWITTER_CONSUMER_KEY, "xxxxxx66666666634333333dddddd")
    }
}
