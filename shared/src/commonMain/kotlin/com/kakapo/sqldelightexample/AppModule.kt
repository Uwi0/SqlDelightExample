package com.kakapo.sqldelightexample

interface AppModule {
    fun provideDatabaseDatasource(): DatabaseDatasource
}