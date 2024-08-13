package com.kakapo.sqldelightexample

import app.cash.sqldelight.db.SqlDriver

expect class DatabaseDriverFactory {
    fun createDriver(): SqlDriver
}

const val DATABASE_NAME = "test.db"
