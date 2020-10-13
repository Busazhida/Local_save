package com.example.lesson5android3.data.adapter.filmAdapter;

import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson5android3.data.adapter.main.BaseRecyclerViewAdapter;
import com.example.lesson5android3.data.model.FilmModel;

import java.util.ArrayList;

public class FilmAdapter extends BaseRecyclerViewAdapter<FilmModel> {

    protected OnItemClickListener listener;
    protected int layout;
    protected int textId;

    public FilmAdapter(ArrayList<FilmModel> list, OnItemClickListener listener, int layout, int textId) {
        super(list);
        this.listener = listener;
        this.layout = layout;
        this.textId = textId;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return super.onCreateViewHolder(parent,layout);
    }

    @Override
    protected void bind(FilmModel filmModel, RecyclerView.ViewHolder holder) {
        TextView text = holder.itemView.findViewById(textId);
        text.setText(filmModel.getTitle());
        holder.itemView.setOnClickListener(view -> listener.onClick(holder.getAdapterPosition()));
    }
}
