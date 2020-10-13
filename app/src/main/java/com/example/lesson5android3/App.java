package com.example.lesson5android3;

import android.app.Application;

import androidx.room.Room;

import com.example.lesson5android3.data.local.room.FilmDatabase;

public class App extends Application {

    public static FilmDatabase db;

    @Override
    public void onCreate() {
        super.onCreate();
        db = Room.databaseBuilder(this,
                FilmDatabase.class, "database-name").allowMainThreadQueries().build();
    }
}
