package com.omio.ideathon

expect fun platformName(): String

fun createApplicationScreenMessage() : String {
    return "Kotlin Rocks on ${platformName()}"
}

enum class TicketType {
    MOBILE, PRINT, VOUCHER;

    fun getDisclaimerKey(): String{
        return when(this){
            MOBILE -> "Ideathon shared - This is a mobile ticket"
            PRINT -> "Ideathon shared - open pdf"
            VOUCHER -> "Ideathon shared - Collect Tickets at Station"
            else -> "Ideathon shared -  Something else"
        }
    }
}
