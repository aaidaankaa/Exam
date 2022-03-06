package com.timmitof.exam.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.timmitof.exam.dao.CategoryDao
import com.timmitof.exam.dao.PaymentsDao
import com.timmitof.exam.dao.ServicesDao
import com.timmitof.exam.entities.Category
import com.timmitof.exam.entities.Payments
import com.timmitof.exam.entities.Services

@Database(entities = [Services::class, Category::class, Payments::class], version = 4, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun CategoryDao(): CategoryDao
    abstract fun ServicesDao(): ServicesDao
    abstract fun PaymentsDao(): PaymentsDao
}