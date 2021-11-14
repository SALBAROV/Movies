package com.example.movies.adapters;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movies.databinding.ItemMoviesBinding;
import com.example.movies.models.MoviesModels;
import com.example.movies.utils.OnItemClickListener;

import java.util.ArrayList;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.ViewHolder> {

    ArrayList<MoviesModels> list = new ArrayList<>();
    ItemMoviesBinding binding;
    OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }

    public void addList(ArrayList<MoviesModels> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemMoviesBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesAdapter.ViewHolder holder, int position) {
        holder.onFill(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemMoviesBinding binding;

        public ViewHolder(@NonNull ItemMoviesBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }

        public void onFill(MoviesModels models) {
            binding.itemImage.setImageResource(models.getImage());
            binding.itemTitle.setText(models.getTitle());
            binding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickListener.setOnClickListener(getAdapterPosition());
                }
            });
        }
    }
}
