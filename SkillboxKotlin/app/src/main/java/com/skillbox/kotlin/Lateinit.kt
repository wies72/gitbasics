package com.skillbox.kotlin

import com.skillbox.kotlin.oop.Car

fun main() {

    val car = Car (4, 4, 200)
    car.openDoor()
    car.setDriver( User("driver", "lastName"))
    car.closeDoor()
}