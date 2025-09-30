package edu.miu.secondary_constructor

class Account (
    var balance: Double,
    var name: String,
    var accountNumber: String
) {
    constructor(accountNumber: String) : this(balance = 0.0, name = "unknown", accountNumber = accountNumber)

    // constructor(accountNumber: String, name: String) : this(balance = 0.0, name = name, accountNumber = accountNumber)
    constructor(accountNumber: String, name: String) : this(accountNumber = accountNumber) {
        this.name = name
    }

    constructor(): this("xxxx")

    override fun toString(): String {
        return "Account(balance=$balance, name='$name', accountNumber='$accountNumber')"
    }
}

fun main() {
    val account = Account()
    account.balance = 100.0
    account.name = "John"
    account.accountNumber = "123456"

    println(account)
}