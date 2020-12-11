package com.skillbox.kotlin

import java.lang.NullPointerException

fun main (){
    try {
        println("before")
        functionWithException()
        println("after")

    } catch (t: NullPointerException) {
        println("catch null exception with info = ${t.message}")
    }
    /*catch (t: Exception){
        println("catch exception with info = ${t.message}")
    }
    catch (t: Throwable){
        println("catch throwable with info = ${t.message}")
    }*/
    finally {
        println("Finally")
    }
}

fun functionWithException() {
    throw Exception("Exception with additional info")
}

