package me.ycdev.android.demo.ble

import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.UUID

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {
    @Test
    @Throws(Exception::class)
    fun addition_isCorrect() {
        assertEquals(4, (2 + 2).toLong())
        System.out.println(UUID.randomUUID())
    }
}