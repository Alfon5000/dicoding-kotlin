package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val sortedNumberList: List<Char> = number.toString().toCharArray().sorted()

    val min = sortedNumberList[0].digitToInt()
    val max = sortedNumberList[sortedNumberList.size - 1].digitToInt()

    return min + max
}
