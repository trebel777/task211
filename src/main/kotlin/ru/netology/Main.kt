package ru.netology

const val MAESTRO = "Maestro"
const val VISA = "Visa"
const val VKPAY = "VKPay"
const val MASTERCARD = "Mastercard"
const val MIR = "Мир"
const val ERROR_LIMIT = -1
const val ERROR_TYPE = -2
const val MINIMUM_COMISSION = 35
fun main() {
    println(comission("Visa",0, 1_000))
}
fun comission(card: String, previousPay: Int, pay: Int): Int {
    return when (card) {
        MAESTRO, MASTERCARD -> if (previousPay + pay < 75_000) 0 else (pay * 0.006 + 20).toInt()
        VISA, MIR -> if (pay * 0.0075 < 35) MINIMUM_COMISSION else (pay * 0.0075).toInt()
        VKPAY -> if (pay <= 15_000 && pay + previousPay <= 40_000) 0 else ERROR_LIMIT
        else -> ERROR_TYPE
    }
}