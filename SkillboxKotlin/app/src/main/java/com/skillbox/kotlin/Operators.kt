package com.skillbox.kotlin

import com.skillbox.kotlin.oop.Rectangle

fun main () {
    listOf (1, 2, 3) + listOf (3, 4, 5)

    val sumRect = Rectangle (0, 0, 10, 20) + Rectangle(0, 0, 30, 50)

    val minusRect = -Rectangle(0,0,50,100)
    println(sumRect)
    println(minusRect)
}