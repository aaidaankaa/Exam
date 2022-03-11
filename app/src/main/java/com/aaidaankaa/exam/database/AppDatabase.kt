package com.aaidaankaa.exam.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aaidaankaa.exam.dao.CategoryDao
import com.aaidaankaa.exam.dao.PaymentsDao
import com.aaidaankaa.exam.dao.ServicesDao
import com.aaidaankaa.exam.entities.Category
import com.aaidaankaa.exam.entities.Payments
import com.aaidaankaa.exam.entities.Services

@Database(entities = [Services::class, Category::class, Payments::class], version = 4, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun CategoryDao(): CategoryDao
    abstract fun ServicesDao(): ServicesDao
    abstract fun PaymentsDao(): PaymentsDao
}