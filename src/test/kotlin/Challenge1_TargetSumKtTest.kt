import kotlin.test.Test
import kotlin.test.expect

internal class Challenge1TargetSumKtTest{

    private val inputArray = arrayOf(3, 5, -4, 8, 11, 1, -1, 6)
    private val targetSum = 10
    private val expected = arrayOf(-1, 11)

    @Test
    fun `two number target sum found`(){
        val actual = twoNumberSum(array = inputArray, targetSum = targetSum)
        expect(actual.size, "number of digits are not two"){ 2 }
        expect(actual.contains(expected[0]), "target sum has not been found"){ true }
        expect(actual.contains(expected[1]), "target sum has not been found"){ true }
    }

}