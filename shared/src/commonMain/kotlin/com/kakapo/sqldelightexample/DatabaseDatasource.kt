package com.kakapo.sqldelightexample

import com.kakapo.Database

class DatabaseDatasource(private val db: Database) {
    private val queries = db.exampleEntityQueries

    fun insert(name: String) = queries.insert(null, name)

    fun getAll() = queries.getAll().executeAsList()

    fun update(id: Long, name: String) = queries.updateName(name, id)

    fun delete(id: Long) = queries.delete(id)
}