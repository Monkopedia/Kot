package otli

import kotlin.test.*

class RepeatTest {

    @Test
    fun testRepeat() {
        var c = 0;
        repeat(5) {
            c++
        }
        assertEquals(5, c);
    }

    @Test
    fun testForLoop() {
        var c = 0;
        for (i in 1 until 3) {
            c++
        }
        assertEquals(2, c);
    }
    
    @Test
    fun testForcedIteration() {
        val iterator = (0 until 3).iterator()
        val first = iterator.next()
        val second = iterator.next()
        val hasMoreTrue = iterator.hasNext()
        val third = iterator.next()
        val hasMoreFalse = iterator.hasNext()

        assertEquals(0, first)
        assertEquals(1, second)
        assertEquals(2, third)
        assertEquals(true, hasMoreTrue)
        assertEquals(false, hasMoreFalse)
    }
}
