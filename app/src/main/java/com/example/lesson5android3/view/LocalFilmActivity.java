package com.example.lesson5android3.view;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson5android3.App;
import com.example.lesson5android3.R;
import com.example.lesson5android3.data.adapter.filmAdapter.FilmAdapter;
import com.example.lesson5android3.data.adapter.filmAdapter.OnItemClickListener;
import com.example.lesson5android3.data.model.FilmModel;

import java.util.ArrayList;

public class LocalFilmActivity extends AppCompatActivity implements OnItemClickListener {

    protected RecyclerView recyclerView;
    protected FilmAdapter adapter;
    protected FilmModel model;
    protected boolean knopka = true;
    protected ArrayList<FilmModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_film);
        init();
        listAdd();
    }

    private void listAdd() {
        list.clear();
        list.addAll(App.db.userDao().getAll());
    }

    private void init() {
        recyclerView = findViewById(R.id.recyclerView_localFilmActivity);
        list = new ArrayList<>();
        adapter = new FilmAdapter(list, this, R.layout.list_local_film, R.id.textName_listLocalFilm);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClick(int position) {
        model = list.get(position);
        Intent intent = new Intent(LocalFilmActivity.this, FilmActivity.class);
        intent.putExtra("knopka", knopka);
        intent.putExtra("model", model);
        startActivity(intent);

    }
}