//# Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum.
// If any two numbers in the input array sum up to the target sum, the function should return them in an array, in any order.
// If no two numbers sum up to the target sum, the function should return an empty array.
//
//input: { array = [3,5,-4,8,11,1,-1,6], targetSum = 10 }
//output: [-1,11]
fun twoNumberSum(array: Array<Int>, targetSum: Int): Array<Int>{
    // exit condition
    var exit = false
    val output = mutableListOf<Int>()
    for ((i, num) in array.withIndex()){
        for (j in (i+1) until array.size){
            val sum = num + array[j]
            if (sum == targetSum){
                exit = true
                output.add(num)
                output.add(array[j])
            }
        }
        if (exit) break else continue
    }
    return output.toTypedArray()
}