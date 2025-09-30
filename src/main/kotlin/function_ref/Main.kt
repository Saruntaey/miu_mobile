package edu.miu.function_ref

fun main() {
    var fn = ::add // function reference operator

    // function signature is optional
    var sub: (Int, Int) -> Int = {a: Int, b: Int ->
//        if (a > b)
//            a - b  // this will not stop the execution
//        b - a

        if (a > b)
            a - b
        else
            b - a
    }

    // if have one input param 'it' is a special keyword to refer to input param
    var sqr: (Int) -> Int = {it * it}

    println(fn(1, 2))
    println(sub(2, 1))
    println(sqr(2))
}

fun add(a: Int, b: Int) = a + b