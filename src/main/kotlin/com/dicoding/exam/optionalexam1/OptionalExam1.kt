package com.dicoding.exam.optionalexam1

import com.dicoding.exam.exam5.sum

// TODO
fun sumOfBigThree(vararg numbers: Int): Int {
    return numbers.sortedDescending().take(3).sum()
}
