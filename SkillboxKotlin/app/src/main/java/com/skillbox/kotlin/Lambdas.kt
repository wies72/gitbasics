package com.skillbox.kotlin

import com.skillbox.kotlin.oop.Car
import javax.security.auth.callback.Callback

fun main () {
     val lambda = { println("Text from lambda")}
    lambda()

    val lambdaWithParams = {x: Int -> println ("X from lambda: $x")}
    lambdaWithParams(10)

    val sumLambda = { x: Int, y: Int -> x + y }
    println ("Sum x and y = ${sumLambda(30,1000)}")

    val users = listOf(
        User ("Vasya", "Sergeev", 30),
        User ("Vasya", "Ivanov", 20),
        User ("Vasya", "Petrov", 10),
        User ("Vasya", "Sidorovich", 50)
    )
    val user1 = users[0]
    val oldestUser = users.maxBy { user -> user.age }
    val maxNameUser = users.maxBy (User::getFullnameLength)
    println(maxNameUser)
    println(oldestUser)

    val car = Car.default
    car.openDoor()
    car.closeDoor { println("Door is closed customs")}

    makeCalculations({ println("result = $it")}, {})
}

inline fun makeCalculations (callback: (Int) -> Unit, noinline  callback2: (Int) -> Unit) {
    val value = 1+1
    callback(value)
}