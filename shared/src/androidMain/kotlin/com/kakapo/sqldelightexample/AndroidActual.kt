package com.kakapo.sqldelightexample

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.kakapo.Database

actual class DatabaseDriverFactory (private val context: Context) {
    actual fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(Database.Schema, context, DATABASE_NAME)
    }

}