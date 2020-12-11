package com.skillbox.kotlin.oop

open class Vehicle (
    val maxSpeed: Int
) {
//    init {
//        println("Car init")
//    }
    var currentSpeed: Int = 0
    

    get() {
        println("currentSpeed get")
        return field
    }
    private set(value) {
        println("currentSpeed set $value")
        field = value
    }

    var fuelCount: Int = 0
        protected set

    open fun getTitle(): String {
        return "Vehicle"
    }

//    constructor(wheelCount: Int, doorCount: Int, bodySize: Triple <Int, Int, Int>) :
//            this(wheelCount, doorCount, bodySize.first, bodySize.second, bodySize.third) {
//        println("Car secondary constructor")

   open fun accelerate (speed: Int) {
        val needFuel = speed / 2

        if (fuelCount >= needFuel) {
            currentSpeed += speed
            useFuel(needFuel)
        }else{
            println("Car has no fuel")
        }
    }

    fun decelerate (speed: Int){
        currentSpeed = maxOf(0,currentSpeed - speed)
    }

    private fun useFuel (fuelCount: Int) {
        this.fuelCount -= fuelCount
    }

    fun refuel (fuelCount: Int) {
        if (currentSpeed == 0) {
            this.fuelCount += fuelCount
        }else {
            println("you cant refuel with currentSpeed != 0")
        }
    }
}
