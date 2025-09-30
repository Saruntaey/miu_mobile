package edu.miu.static_demo

class Stack {

    // can have only one companion per class and should be inside a class
    companion object {
        val stack = mutableListOf<Int>()
        fun push(item: Int) {
            stack.add(item)
        }
        fun pop(): Int {
            return stack.removeLast()
        }
        fun size(): Int {
            return stack.size
        }
    }
}

fun main() {
    Stack.push(1)
    Stack.push(2)
    println(Stack.stack)
    println(Stack.pop())
    println(Stack.stack)
}
