package edu.miu.data_class

data class Requestdto(
    val name: String,
    val age: Int
)

fun main() {
    val request = Requestdto("John", 2)
    println(request)

    val request2 = request.copy()
    println(request2)
    println(request2 == request) // call .equals method
    println(request2.equals(request))
    println(request2 === request) // check reference also

    val request3 = request.copy(name="Jane") // change value while copy
    println(request3)
}