package com.example.w3m3_2;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.w3m3_2.databinding.PizzaItemBinding;

public class PizzaViewHolder extends RecyclerView.ViewHolder {

    PizzaItemBinding binding;

    public PizzaViewHolder(@NonNull PizzaItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(String name, String image){
        binding.txtPizza.setText(name);
        Glide.with(binding.imgPizza).load(image).into(binding.imgPizza);
    }
}
