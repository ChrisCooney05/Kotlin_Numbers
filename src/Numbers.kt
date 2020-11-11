// Write your code below
fun getListOfNumbers(): List<Int> {
    val myList = mutableListOf<Int>()
    for (i in 1..7) {
        println("Number please")
        val num = readLine()!!.toInt()
        myList.add(num)
    }
    return myList
}

fun findMax(arr: List<Int>): Int {
    var largestNumber = arr[0]
    for (num in arr) {
        if (num > largestNumber) {
            largestNumber = num
        }
    }
    return largestNumber
}

fun findMin(arr: List<Int>): Int {
    var smallestNumber = arr[0]
    for (num in arr) {
        if (num < smallestNumber) {
            smallestNumber = num
        }
    }
    return smallestNumber
}

fun findAverage(arr: List<Int>): Int {
    val sum = arr.sum()
    return sum / arr.size
}

fun checkIfListContains(arr: List<Int>, value: Int): Boolean {
    for (num in arr) {
        if (num == value) {
            return true
        }
    }
    return false
}

fun main() {
    // Write more code below
    val values = getListOfNumbers()
    println(values)

    val largestValue = findMax(values)
    println("The largest number is $largestValue")

    val smallestValue = findMin(values)
    println("The smallest number is $smallestValue")

    val average = findAverage(values)
    println("The average is $average")

    println("Give me a number to find in the list")
    val numToFind = readLine()!!.toInt()

    when (checkIfListContains(values, numToFind)) {
        true -> println("That value is in the list")
        else -> println("That value is not in the list")
    }
}

