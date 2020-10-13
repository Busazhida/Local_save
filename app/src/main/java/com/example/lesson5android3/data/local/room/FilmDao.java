package com.example.lesson5android3.data.local.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.lesson5android3.data.model.FilmModel;

import java.util.List;

@Dao
public interface FilmDao {

    @Query("SELECT * FROM filmmodel")
    List<FilmModel> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(FilmModel filmModels);

    @Delete
    void delete(FilmModel filmModel);


}
