package com.example.lesson5android3.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson5android3.R;
import com.example.lesson5android3.data.adapter.filmAdapter.FilmAdapter;
import com.example.lesson5android3.data.adapter.filmAdapter.OnItemClickListener;
import com.example.lesson5android3.data.model.FilmModel;
import com.example.lesson5android3.data.network.FilmApiService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@SuppressWarnings("NullableProblems")
public class MainActivity extends AppCompatActivity implements OnItemClickListener {

    protected RecyclerView recyclerView;
    protected FilmAdapter adapter;
    protected ArrayList<FilmModel> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        getFilms();
    }

    private void getFilms() {
        FilmApiService.getInstance().getPostApi().getUsers().enqueue(new Callback<List<FilmModel>>() {
            @Override
            public void onResponse(Call<List<FilmModel>> call, Response<List<FilmModel>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    list.addAll(response.body());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<List<FilmModel>> call, Throwable t) {

            }
        });
    }

    private void init() {
        recyclerView = findViewById(R.id.recyclerView);
        list = new ArrayList<>();
        adapter = new FilmAdapter(list, this, R.layout.list_film, R.id.textName_listFilm);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClick(int position) {
        FilmModel model = list.get(position);
        Intent intent = new Intent(this, FilmActivity.class);
        intent.putExtra("model", model);
        startActivity(intent);
    }

    public void onClick(View view) {
        startActivity(new Intent(this, LocalFilmActivity.class));
    }
}