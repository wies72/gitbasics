package com.skillbox.kotlin

fun main() {
    val color = Color.BLACK.hex
    Color.RED.draw()

    Color.values().forEach {
        it.draw()
        println(it.name)
        println(it.ordinal)
    }

    Color.valueOf("RED")
    Color.values()[Color.RED.ordinal]


    SealedColor.Black
    SealedColor.CustomColor ("ff0")

}

fun invertColor (color: Color): Color {
    return when (color) {
        Color.WHITE -> Color.BLACK
        Color.BLACK -> Color.WHITE
        Color.RED -> Color.BLUE
        Color.BLUE -> Color.RED
    }
}

fun invertColor2 (color: SealedColor): SealedColor {
    return when (color) {
        SealedColor.Black -> SealedColor.White
        SealedColor.White -> SealedColor.Black
        is SealedColor.CustomColor -> {
            SealedColor.White
        }
    }
}