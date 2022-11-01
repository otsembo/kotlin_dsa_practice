import java.util.Arrays
import kotlin.math.pow

// Write a function that takes in a non-empty array of integers that are sorted in ascending order
// and returns a new array of the same length with the squares of the original integers also sorted in ascending order.
//For example:
//array = [1,  2,  3,  5,  6,  8,  9]
//Returns: [1,  4,  9,  25,  36,  64,  81]

fun sortedSquareArray(array: Array<Int>): Array<Int>{
    val output = mutableListOf<Int>()
    array.forEach {
        output.add(it.toDouble().pow(2).toInt())
    }
    return output.toTypedArray()
}