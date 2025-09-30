package edu.miu.customaccessor

class Account {
    var balance: Double = 0.0
    var name: String = ""
    var accountNumber: String = ""
        set(value) {
            // validate...
            field = value // field is a hidden identifier that refer to accountNumber

            // don't do this. it will get called recursive
            // accountNumber = value
        }
        get() {
            return field
        }

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