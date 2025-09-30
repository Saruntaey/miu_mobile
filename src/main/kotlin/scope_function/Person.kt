package edu.miu.scope_function

class Person (
    var name: String = "",
    var age: Int = 0,
){
    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }
}

fun main() {
    val p = Person()
    println(p.apply {
        this.name = "John"
        this.age = 20
    } .toString())
}