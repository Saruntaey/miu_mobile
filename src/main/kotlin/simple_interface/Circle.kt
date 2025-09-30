package edu.miu.simple_interface

interface Circle {
    val pi: Double
        get() = 3.14
    val radius: Double // abstract property
    fun getArea(): Double = pi * radius * radius
    fun drawCircle() // abstract method
}

class CircleImpl(override val radius: Double): Circle {
    override val pi: Double = 4.5
    override fun drawCircle() {
        TODO("unimplemented")
    }
}