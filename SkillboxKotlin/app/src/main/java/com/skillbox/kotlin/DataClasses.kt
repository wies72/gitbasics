package com.skillbox.kotlin

import com.skillbox.kotlin.oop.Car

fun main () {
    val user1 = User ("name1", "lastName1")
    user1.innerState = "state1"
    val user2 = User ("name1", "lastName1")
    user2.innerState = "state2"

    println(user1 == user2)

    val user3 = user1.copy (lastName = "copiedLastName")
    println("user3 inner state = ${user3.innerState}")

    println(user1)

    val (name, lastName) = User ("name5", "lastName5")
    println("name = $name")
    println("lastName = $lastName")

    val user6 = User ("name6", "lastName6")
    val name1 = user6.component1()
    val lastName1 = user6.component2()
    println("name1 = $name1")
    println("lastName1 = $lastName1")

    val users = listOf (
        user1,
        user2,
        user3
    )

    users.forEach{(name, lastName) -> println ("$name, $lastName")}

    val (wheelCount, doorCount) = Car (4, 2, 200)

    val map = mapOf (
        1 to "1",
        2 to "2"
    )

    for ((key, value) in map) {
        key
        value
    }
}