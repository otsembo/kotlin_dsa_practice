import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertSame

internal class Challenge2_SortedSquareArrayKtTest{

    private val inputArray = arrayOf(1,  2,  3,  5,  6,  8,  9)
    private val expected = arrayOf(1,  4,  9,  25,  36,  64,  81)

    @Test
    fun `generate array of squares`(){
        val actual = sortedSquareArray(inputArray)
        assertContentEquals(expected = expected, actual = actual, message = "The square of integers was not found")
    }

}