package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {
    @Test
    fun testPrint(){
        println(comission("Visa",0, 1_000))
        assertEquals(35,35)
    }
    @Test
    fun testPrint2(){
        println(comission("Maestro",0, 1_000))
        assertEquals(35,35)
    }


    @Test
    fun comissionMaestro() {
        val card = "Maestro"
        val previousPay = 0
        val pay = 1_000

        val result = comission(card, previousPay, pay)
        assertEquals(0, result)
    }
    @Test
    fun comissionMaestro2() {
        val card = "Maestro"
        val previousPay = 0
        val pay = 80_000

        val result = comission(card, previousPay, pay)
        assertEquals(500, result)
    }



    @Test
    fun comissionMastecard() {
        val card = "Mastercard"
        val previousPay = 0
        val pay = 1_000

        val result = comission(card, previousPay, pay)
        assertEquals(0, result)
    }
    @Test
    fun comissionMastecard2() {
        val card = "Mastercard"
        val previousPay = 0
        val pay = 90_000

        val result = comission(card, previousPay, pay)
        assertEquals(560, result)
    }

    @Test
    fun comissionVisa() {
        val card = "Visa"
        val previousPay = 0
        val pay = 1_000

        val result = comission(card, previousPay, pay)
        assertEquals(35, result)

    }
    @Test
    fun comissionVisa2() {
        val card = "Visa"
        val previousPay = 0
        val pay = 100_000

        val result = comission(card, previousPay, pay)
        assertEquals(750, result)
    }

    @Test
    fun comissionMir() {
        val card = "Мир"
        val previousPay = 0
        val pay = 1_000

        val result = comission(card, previousPay, pay)
        assertEquals(35, result)

    }
    @Test
    fun comissionMir2() {
        val card = "Мир"
        val previousPay = 0
        val pay = 100_000

        val result = comission(card, previousPay, pay)
        assertEquals(750, result)
    }

    @Test
    fun comissionVKPay() {
        val card = "VKPay"
        val previousPay = 0
        val pay = 1_000

        val result = comission(card, previousPay, pay)
        assertEquals(0, result)
    }
    @Test
    fun comissionVKPay2() {
        val card = "VKPay"
        val previousPay = 0
        val pay = 20_000

        val result = comission(card, previousPay, pay)
        assertEquals(ERROR_LIMIT, result)
    }
    @Test
    fun comissionVKPay3() {
        val card = "VKPay"
        val previousPay = 10_000
        val pay = 14_000

        val result = comission(card, previousPay, pay)
        assertEquals(0, result)
    }
    @Test
    fun comissionVKPay4() {
        val card = "VKPay"
        val previousPay = 40_000
        val pay = 14_000

        val result = comission(card, previousPay, pay)
        assertEquals(ERROR_LIMIT, result)
    }
    @Test
    fun comissionErrorType() {
        val card = "Белкард"
        val previousPay = 0
        val pay = 10_000

        val result = comission(card, previousPay, pay)
        assertEquals(ERROR_TYPE, result)
    }
}