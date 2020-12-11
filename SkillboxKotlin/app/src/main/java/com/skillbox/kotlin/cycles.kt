package com.skillbox.kotlin

fun main() {
    print("Введите число: ")
    val n = readLine()?.toIntOrNull() ?: return

    println("Вы ввели число: $n")

    println("Сумма с помощью while = ${calculateSumByWhile(n)}")
    println("Сумма с помощью while and break = ${calculateSumByWhileInfiniteBreak(n)}")

    printEvenNumbers(n)

    println("Сумма с помощью do while = ${calculateSumDoWhile(n)}")
    println("Сумма с помощью for = ${calculateSumFor(n)}")

    printChars()
    printEvenNumberFor(n)

    println(calculateSumRecursive(n))
    println(calculateSumRecursiveTailrec(n))
}

fun calculateSumByWhile (n: Int): Long {
    var sum: Long = 0
    var currentNumber: Int = 0
    while (currentNumber <= n) {
        println("Iteration $currentNumber")
        sum += currentNumber
        currentNumber++
    }

    return sum
}

fun calculateSumByWhileInfiniteBreak (n: Int): Long {
    var sum: Long = 0
    var currentNumber: Int = 0
    while (true) {

        if(currentNumber > n) break

        sum += currentNumber
        currentNumber++
    }

    return sum
}

fun printEvenNumbers (n: Int) {
    var currentNumber = 0
    while (currentNumber <= n) {
        val numberBefore = currentNumber
        currentNumber++
        if (numberBefore % 2 == 1) continue
        println(numberBefore)
    }
}

fun calculateSumDoWhile (n: Int): Long {
    var sum: Long = 0
    var currentNumber: Int = 0

    do {
        println("Iteration $currentNumber")
        sum += currentNumber
        currentNumber++
    } while (currentNumber <= n)

    return sum
}

fun calculateSumFor (n: Int): Long {
    var sum: Long = 0

    val range = 0..n //0 until n - не в ключительно

    for (currentNumber in range){
        sum += currentNumber
    }

    return sum
}

fun printChars () {
    for (currentCh in "string")
        println(currentCh)
}

fun printEvenNumberFor (n: Int) {
    val range = n downTo 0 step 2
    for (currentNumber in range) {
        println(currentNumber)
    }

}

//рекурсии



fun calculateSumRecursive (n: Int): Int {
    return if (n==0) {
        0
    } else {
        n + calculateSumRecursive (n-1)
    }
}

tailrec fun calculateSumRecursiveTailrec (n: Int, accum: Int = 0): Int {
    return if (n==0) {
        accum
    } else {
        calculateSumRecursiveTailrec (n-1, accum + n)
    }
}