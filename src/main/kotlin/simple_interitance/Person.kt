package edu.miu.simple_interitance

open class Person (var name: String)

class Student(name: String, var grade: Int) : Person(name)

fun main() {
    val student = Student("John", 2)
    // name is attribute of class Person. Student do not have attribute name (no [var|val])
    println(student.name)

    println(student.grade)
}
