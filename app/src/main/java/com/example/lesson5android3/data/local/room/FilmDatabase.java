package com.example.lesson5android3.data.local.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.lesson5android3.data.model.FilmModel;

@Database(entities = {FilmModel.class}, version = 1)
public abstract class FilmDatabase extends RoomDatabase {
    public abstract FilmDao userDao();
}