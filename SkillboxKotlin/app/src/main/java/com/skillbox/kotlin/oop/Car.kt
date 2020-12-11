package com.skillbox.kotlin.oop

import com.skillbox.kotlin.Engine
import com.skillbox.kotlin.User
import java.sql.Driver



class Car (
    val wheelCount: Int,
    val doorCount: Int,
    maxSpeed: Int
): Vehicle (maxSpeed) {
    var isDoorOpen: Boolean = false
        private set

    private lateinit var driver: User

    private val engine by lazy {
        Engine ()
    }

    operator fun component1(): Int = wheelCount
    operator fun component2(): Int = doorCount

    fun openDoor (openCallback: () -> Unit = { println("Door is opened")}) {
        if (!isDoorOpen) {
            openCallback()
        }
        isDoorOpen = true
    }

    fun closeDoor (closeCallback: () -> Unit = { println("Door is closed")}) {
        if (isDoorOpen) {
            closeCallback()
            if (::driver.isInitialized) {
                println("driver = $driver")
            }
        }
        isDoorOpen = false
    }

    override fun accelerate(speed: Int) {
        engine.use()
        if (isDoorOpen) {
            println("You cant accelerate with opened door")
        } else {
            super.accelerate(speed)
        }
    }

    fun setDriver (driver: User) {
        this.driver = driver
    }

    override fun getTitle(): String = "Car"

    fun accelerate (speed: Int, force: Boolean) {
        if (force) {
            if (isDoorOpen) println("Warning, accelerate with opened door")
            super.accelerate(speed)
        } else {
            accelerate(speed)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Car

        if (wheelCount != other.wheelCount) return false
        if (doorCount != other.doorCount) return false
        if (isDoorOpen != other.isDoorOpen) return false

        return true
    }

    override fun hashCode(): Int {
        var result = wheelCount
        result = 31 * result + doorCount
        result = 31 * result + isDoorOpen.hashCode()
        return result
    }

    companion object{
        val default = Car(4, 4, 200)

        fun createWithDefaultWheelCount (doorCount: Int, maxSpeed: Int): Car{
            return Car (wheelCount = 4, doorCount = doorCount, maxSpeed = maxSpeed)
        }
    }

    
}


//class Car: Vehicle {
//    constructor():super (100) {
//
//    }
//}