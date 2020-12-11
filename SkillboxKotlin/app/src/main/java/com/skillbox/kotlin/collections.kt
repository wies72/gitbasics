package com.skillbox.kotlin

fun main() {

    //Array

    val array = arrayOf ("Петр", "Александр", "Василий") + arrayOf("Сергей")
    for (user in array){
        println(user)
    }

    array.forEach { println (it) }
    array.forEachIndexed { index, user -> println("Index = $index, element = $user") }

    val firstElement = array[0]
    val lastElement = array[array.lastIndex]

    array[0] = "Новый петр"
    array.forEach { println (it) }

    val emptyArray = emptyArray <String> ()

    val largeArray = Array (100) { index -> "User #$index" }
    largeArray.forEach {  println(it) }


    //List

    val list = mutableListOf <Int> ()
    list.add(101010)
    println("LIST - $list")

    val immutableList = listOf ("1", "2", "3")
    println(immutableList)

    immutableList[1]

    immutableList.forEach {println (it) }

    val emptyList = emptyList <String> ()
    println(emptyList)

    val mutableList = mutableListOf ( "2", "3", "4" )

    mutableList[0] = "1.2"
    mutableList.forEach { println (it) }

    mutableList.removeAt(0)
    mutableList.add("4")
    mutableList.add(1,"new 1")

    mutableList.forEach { println (it) }

    mutableList.addAll ( listOf ("10","20") )
    println(mutableList)


    //Set  хранит неповторяющиеся элементы

    val immutableSet = setOf (4,5,6,3,25,3,4,1)
    println(immutableSet)

    val unionSet = setOf (1,2,3).union (setOf(1,4,5))
    println(unionSet)

    val substractSet = setOf (1,2,3).subtract(setOf(1,2,4))
    println(substractSet)

    val intersectSet = setOf (1,2,4).intersect (setOf(4,5,5))
    println(intersectSet)

    val naturalOrderSet = sortedSetOf (1,4,6,1,6,5,9)
    println(naturalOrderSet)
    println(naturalOrderSet.descendingSet())

    val naturalOrderSet1 = sortedSetOf (1,4,6,1,6,5,9).toMutableSet()
    mutableSetOf(1,2,3).add(34)

    val hashSet = hashSetOf(1,2,3)
    hashSet.add(1)
    hashSet.remove(1)

    hashSet.contains(1)
    println(1 in hashSet)


    //Map Ключ-значение

    val pair1 = Pair("key", "value")
    val pair2 = 1 to 2

    println("first = ${pair1.first}, second = ${pair1.second}")
    println(pair2)

    val map = mapOf(
        "name1" to "+787655",
        "name2" to "+787656",
        "name3" to "+787657"
    )

    println(map["name1"])
    println(map["name4"])
    println(map)

    val mutableMap = map.toMutableMap()
    val mutableMap2 = mutableMapOf("1" to "2")
    mutableMap ["name1"] = "123123"
    mutableMap ["name"] = "121121"
    mutableMap.put("key", "value")

    println(mutableMap)
    mutableMap.remove("key")

    mutableMap.toMap()

    val sortedMap = sortedMapOf (
        "2" to "22",
        "3" to "12",
        "1" to "24",
        "24" to "21"
    )

    val hashMap = hashMapOf(
        "2" to "22",
        "3" to "12",
        "1" to "24",
        "24" to "21"
    )

    println(sortedMap)

    println(hashMap.keys)
    println(hashMap.values)

    for (key in hashMap.keys) {
        println("key = $key, value = ${hashMap [key]}")
    }

    hashMap.forEach { (key, value) ->
        key
        value
    }
}