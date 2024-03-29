package com.dheeraj.architecture.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dheeraj.architecture.model.Post
import com.dheeraj.architecture.model.PostDao

@Database(entities = [Post::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}