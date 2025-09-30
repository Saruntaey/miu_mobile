package edu.miu.primary_constructor

class Account (private var balance: Double, var name: String, val accountNumber: String) {
    override fun toString(): String {
        return "Account(balance=$balance, name='$name', accountNumber='$accountNumber')"
    }
}

fun main() {
    val account = Account(100.0, "John", "123456")

    // cannot access private attribute
    // account.balance

    // cannot motify due to declare as val
    // account.accountNumber = "654321"
    println(account.accountNumber)

    account.name = "Jim"

    println(account)
}