package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    if (str.any { it.isDigit() }) {
        val numberInString = str.filter { it.isDigit() }.toInt()
        val onlyString = str.filter { !it.isDigit() }

        return "$onlyString${ numberInString * int }"
    }

    return "$str$int"
}
