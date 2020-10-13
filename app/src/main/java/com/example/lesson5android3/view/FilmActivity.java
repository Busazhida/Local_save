package com.example.lesson5android3.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lesson5android3.App;
import com.example.lesson5android3.R;
import com.example.lesson5android3.data.model.FilmModel;

public class FilmActivity extends AppCompatActivity {
    protected TextView textTitle;
    protected TextView textDesc;
    protected FilmModel model;
    protected Button btnSave;
    protected boolean knopka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film);
        init();
        getModel();
        setText();
    }

    private void setText() {
        textTitle.setText(model.getTitle());
        textDesc.setText(model.getDescription());
    }

    private void getModel() {
        if (getIntent() != null) {
            model = (FilmModel) getIntent().getSerializableExtra("model");

            knopka = getIntent().getBooleanExtra("knopka", false);
            if (knopka)
                btnSave.setVisibility(View.GONE);
        }
    }

    private void init() {
        textTitle = findViewById(R.id.textTitle_filmActivity);
        textDesc = findViewById(R.id.textDesc_filmActivity);
        btnSave = findViewById(R.id.btnSave_filmActivity);
    }

    public void onClick(View view) {
        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
        App.db.userDao().insertAll(model);
    }
}