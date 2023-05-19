package ru.netology

fun main() {

    val itemPrice = 100
    val discount = 100
    val discountStart = 1_000
    val discountStop = 10_000
    val discountFive = 0.05
    val discountOne = 0.01

    println ("введите колличество песен для покупки")
    var itemCount:Int   = readln().toInt()
    val totalPrice = itemPrice * itemCount

    println ("введите 1, если вы регулярный покупатель")
    var regularCustomer:Int   = readln().toInt()

    var result = when {
        totalPrice in discountStart..discountStop -> {
            print("после применения скидки в $discount рублей - ")
            totalPrice - discount
        }
        totalPrice > discountStop -> {
            print("после применения 5% скидки — ")
            totalPrice - (totalPrice*discountFive).toInt()
        }
        else -> { totalPrice }
    }
    println("$result рублей.")
    if(regularCustomer == 1) {
        result -= (result*discountOne).toInt()
        println("после применения скидки регулярного покупателя — $result рублей.")
    }

}
