import various.IndicatingList
import kotlin.test.*
import kotlin.test.Test

class IndicatingListTest {

    @Test
    fun testEmptyIndList() {

        val uut = IndicatingList<String>()

        assertNull(uut.back())
        assertTrue(uut.isEmpty())
        assertEquals(0, uut.count())
        assertEquals(-1, uut.position())
    }

    @Test
    fun testPushAndBackBack() {

        val uut = IndicatingList<String>()

        uut.push("test")

        assertFalse(uut.isEmpty())
        assertEquals(1, uut.count())
        assertEquals(0, uut.position())

        assertEquals("test", uut.back())
        assertEquals("test", uut.back())
        assertEquals(1, uut.count())
        assertEquals(0, uut.position())
    }

    @Test
    fun testPushTwoAndBackOneAndPushTwo() {

        val uut = IndicatingList<String>()

        uut.push("foo")
        uut.push("bar")

        assertEquals(2, uut.count())
        assertEquals(1, uut.position())

        assertEquals("foo", uut.back())
        assertEquals(2, uut.count())
        assertEquals(0, uut.position())

        uut.push("foo2")
        assertEquals(2, uut.count())
        assertEquals(1, uut.position())

        uut.push("bar2")
        assertEquals(3, uut.count())
        assertEquals(2, uut.position())
    }

    @Test
    fun testIterator() {

        val uut = IndicatingList<String>()
        uut.push("foo")
        uut.push("bar")

        for ((count, s) in uut.withIndex()) {
            when(count) {
                0 -> assertEquals("foo", s)
                1 -> assertEquals("bar", s)
                else -> fail("too many iterations")
            }
        }
    }
}