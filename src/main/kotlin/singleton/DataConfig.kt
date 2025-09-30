package edu.miu.singleton

object DataConfig {
    fun getConnection() {
        println("Connecting to database...")
    }
}

fun main() {
    DataConfig.getConnection()
    DataConfig.getConnection()
    DataConfig.getConnection()
    DataConfig.getConnection()
}