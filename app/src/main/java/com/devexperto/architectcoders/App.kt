package com.devexperto.architectcoders

import android.app.Application
import androidx.room.Room
import com.devexperto.architectcoders.data.database.MovieDatabase

class App : Application() {

    lateinit var db: MovieDatabase
        private set

    override fun onCreate() {
        super.onCreate()

        db = Room.databaseBuilder(
            this,
            MovieDatabase::class.java, "movie-db"
        ).build()
    }
}