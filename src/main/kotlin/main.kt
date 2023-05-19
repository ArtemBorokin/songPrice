package ru.netology

fun main() {

    val itemPrice = 100
    val discount = 100
    val discountStart = 1_000
    val discountStop = 10_000
    val discountFive = 0.05
    val discountOne = 0.01

    println ("введите колличество песен для покупки")
    var itemCount:Int   = readLine()!!. toInt()
    val totalPrice = itemPrice * itemCount
    val result = if (totalPrice > discountStart && totalPrice < discountStop) totalPrice - discount
    else totalPrice
    println("покупка - $totalPrice рублей →")
    println("после применения скидки в $discount рублей — $result рублей.")

    val resultFive =  if (totalPrice > (discountStop +1)) totalPrice - ((totalPrice - discount) * discountFive) else totalPrice - discount
    println("после применения 5% скидки — $resultFive рублей.")
    val resultOne=  if (totalPrice > 1) totalPrice - ((totalPrice - discount) * discountFive) - (((totalPrice - discount) * discountFive) * discountOne) else totalPrice
    println("после применения 1% скидки — $resultOne рубля.")

}
