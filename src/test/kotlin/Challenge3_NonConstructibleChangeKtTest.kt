import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test
import kotlin.test.expect

internal class Challenge3_NonConstructibleChangeKtTest {
    private val input = arrayOf(5,  7,  1, 1,  2,  3,  22)
    private val expected = 20

    @Test
    fun `find some coin balance`(){
        expect(expected, "That is not the correct change"){ nonConstructibleChange(input) }
    }

}