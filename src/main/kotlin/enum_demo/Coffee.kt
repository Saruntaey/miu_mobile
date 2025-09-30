package edu.miu.enum_demo

enum class Coffee {
    AMERICANO,
    LATTE,
    CAPPUCCINO,
    ESPRESSO,
}

fun main() {
    println(Coffee.CAPPUCCINO)
    println(Coffee.CAPPUCCINO.name)
    println(Coffee.values().joinToString{it.name})
}