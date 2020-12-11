package com.skillbox.kotlin

import com.skillbox.kotlin.oop.*

fun main(){

    val shape = Rectangle (x = 1, y = 1, width = 2, height = 2)
    shape.printPosition()
    shape.moveToPosition(2,2)
    shape.printPosition()

    println("shape area = ${shape.calculateArea()}")
    println("shape name = ${shape.name}")

    val largeRectangle = Rectangle (1,1,20,30)

    println("shape <= largeRectangle (${shape <= largeRectangle})")

    val set: MutableSet <Rectangle> = sortedSetOf(
        largeRectangle,
        shape
    )

    println(set)

    val shapeA = object : Shape {

        val  additionalField = 123

        fun additionalMethod() = 234

        override val name: String = "Anonymous shape"

        override fun calculateArea(): Double = 0.0

    }

    shapeA.additionalField
    shapeA.additionalMethod()

//    listOf<Vehicle>(
//        Vehicle(100),
//        Car(4,2,120),
//        Airplane(1100)
//    ).forEach {
//        println(it.getTitle())
//    }
//
 val tesla = Car( 4, 2,150)
//
//    with (tesla) {
//        refuel(100)
//        openDoor()
//        accelerate(100)
//        accelerate(100, force = true)
//        decelerate(50)
//    }

//    val vehicle: Vehicle = tesla
//
//    println("vehicle is car = ${vehicle is Car}")
//    println("tesla is vehicle = ${tesla is Vehicle}")
//    println("vehicle is car = ${Vehicle (maxSpeed = 100) is Car}")
//
//    val newCar: Car? = vehicle as? Car
//    newCar?.closeDoor()

//    tesla.refuel(100)
//    tesla.openDoor()
//    tesla.closeDoor()
//    tesla.accelerate(100)
//    tesla.decelerate(50)

//    val vehicle = Vehicle (maxSpeed = 200)

}



//fun main(){
//    val tesla = Vehicle(
//        doorCount = 2, bodyWidth = 200, bodyLength = 500, bodyHeight = 150, wheelCount = 4,
//        maxSpeed = 200
//    )
//
//    println("tesla wheelCount = ${tesla.wheelCount}, doorCount = ${tesla.doorCount}, " +
//            "currentSpeed = ${tesla.currentSpeed}")
//
//    tesla.accelerate(100)
//
//    println("tesla currentSpeed = ${tesla.currentSpeed}")
//
//    tesla.decelerate(100)
//
//    println("tesla currentSpeed = ${tesla.currentSpeed}")
//
//    println("tesla currentFuel = ${tesla.fuelCount}")
//
////    tesla.currentSpeed = 234
////
////    println("currentSpeed = ${tesla.currentSpeed}")
//
////    val nissan = Car(4, 2, Triple(500,200,150))
//}