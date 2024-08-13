package com.kakapo.sqldelightexample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform