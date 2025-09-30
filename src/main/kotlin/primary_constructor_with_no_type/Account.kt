package edu.miu.primary_constructor_with_no_type

class Account (
    balance: Double = 0.0,
    name: String = "",
    accountNumber: String = ""
) {
    var i_balance: Double = balance
    var i_name: String = name
    var i_accountNumber: String = accountNumber

    init {
        // can access only in init block
        println("Account(balance=$balance, name='$name', accountNumber='$accountNumber')")
        i_balance = balance
        i_name = name
        i_accountNumber = accountNumber
    }

    override fun toString(): String {
        // cannot access because no [var|val] keyword class will not have that attribute
        // return "Account(balance=$balance, name='$name', accountNumber='$accountNumber')"

         return "Account(balance=$i_balance, name='$i_name', accountNumber='$i_accountNumber')"
    }
}

fun main() {
    val account = Account(100.0, "John", "123456")

    println(account)
}