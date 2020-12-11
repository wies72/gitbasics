package com.skillbox.kotlin

enum class Color (
    val hex: String
) : Drawable {
    WHITE ("#fff"),
    BLACK ("#000"),
    RED ("#f00") {
        override fun draw() {
            println("draw red color")
        }
    },
    BLUE ("#00f");

    fun someMethod () {

    }

    override fun draw() {
        println("draw color")
    }

    companion object{
        fun fromName (name: String): Color? {
            return values().find { it.name == name.toUpperCase() }
        }
    }
}