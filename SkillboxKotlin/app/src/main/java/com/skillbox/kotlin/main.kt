package com.skillbox.kotlin

import kotlin.math.sqrt

fun main() {
    val x1x2 = solveEqualion(a = 15.0, b = 2.0, c = 1.0)

    println("product: $x1x2")

}
fun discriminant (a: Double, b: Double, c: Double) = b*b - 4 * a * c


fun solveEqualion(a: Double, b: Double, c: Double) :Double {

    val sd = (discriminant(a, b, c))
    val x1 = (-b + sd) / (2 * a)
    val x2 = (-b - sd) / (2 * a)
    println("x1 = $x1 x2 = $x2")
    println("x1 * x2 = ${x1 * x2}")
    return x1 + x2
}