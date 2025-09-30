package edu.miu.higher_order_function

fun main() {
    println(operation(2, 3, ::add))
    println(operation(2, 3, ::sub))
    println(operation(2, 3, {a, b -> a * b}))

    var res = operation(2, 3) {a, b -> a * b} // if last input is a lambda. It could be outside ()
    println(res)

    res = foo(1, 2, {a, b -> a * b}) {a, b -> a + b}
    println(res)
}

fun add(a: Int, b: Int): Int = a + b
fun sub(a: Int, b: Int): Int = a - b

fun operation(a: Int, b: Int, fn: (Int, Int) -> Int): Int {
    return fn(a, b)
}

fun foo(a: Int, b: Int, fn1: (Int, Int) -> Int, fn2: (Int, Int) -> Int): Int{
    return fn1(a, b) * fn2(a, b)
}