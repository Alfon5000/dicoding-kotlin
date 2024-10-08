package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): String {
    val length = string.length

    if (length % 2 == 0) {
        return "${string[length / 2 - 1]}${string[length / 2]}"
    }

    return "${string[length / 2]}"
}
