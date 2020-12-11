package com.skillbox.kotlin

data class User(
    val name: String,
    val lastName: String,
    val age: Int = 0
) {
    var innerState: String = ""
    fun getFullnameLength() = "$name$lastName".length
}