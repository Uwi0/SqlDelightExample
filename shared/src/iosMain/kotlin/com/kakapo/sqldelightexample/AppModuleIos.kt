package com.kakapo.sqldelightexample

import com.kakapo.Database

class AppModuleIos {
    private val db by lazy {
        Database(driver = DatabaseDriverFactory().createDriver())
    }

    fun provideDatabaseDatasource(): DatabaseDatasource = DatabaseDatasource(db)
}