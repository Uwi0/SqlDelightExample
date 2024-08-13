package com.kakapo.sqldelightexample

import android.content.Context
import com.kakapo.Database

class AppModuleAndroid(
    private val context: Context
) : AppModule {

    private val db by lazy {
        Database(driver = DatabaseDriverFactory(context).createDriver())
    }

    override fun provideDatabaseDatasource(): DatabaseDatasource {
        return DatabaseDatasource(db)
    }
}