package com.example.w3m3_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.w3m3_2.databinding.FragmentScreenMainBinding;

import java.util.ArrayList;

public class ScreenMainFragment extends Fragment {

    FragmentScreenMainBinding binding;
    PizzaAdapter adapter;
    private ArrayList<String> pizzaList = new ArrayList<>();
    private ArrayList<String> imageList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentScreenMainBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new PizzaAdapter(pizzaList, imageList);
        binding.rvView.setAdapter(adapter);
    }
    private void loadData(){
        imageList.add("https://www.alma.scuolacucina.it/wp-content/uploads/2021/11/PIZZA-NAPOLETANA-3-web-1410x940.jpg");
        pizzaList.add("Pizza Napoletana");
        imageList.add("https://www.alma.scuolacucina.it/wp-content/uploads/2021/11/calzone-pizza-1410x940.jpg");
        pizzaList.add("Calzone");
        imageList.add("https://www.alma.scuolacucina.it/wp-content/uploads/2021/11/shutterstock_pizza-romana.jpg");
        pizzaList.add("Pizza Romana");
        imageList.add("https://www.alma.scuolacucina.it/wp-content/uploads/2021/11/shutterstock_pizza-al-taglio.jpg");
        pizzaList.add("Pizza al taglio");
        imageList.add("https://www.alma.scuolacucina.it/wp-content/uploads/2021/11/shutterstock_1698744682-1410x1058.jpg");
        pizzaList.add("Pizza Siciliana");
        imageList.add("https://www.alma.scuolacucina.it/wp-content/uploads/2021/11/PIZZA-FRITTA-1410x940.jpg");
        pizzaList.add("Pizza fritta");
        imageList.add("https://www.alma.scuolacucina.it/wp-content/uploads/2021/11/shutterstock_pizza-al-tegamino.jpg");
        pizzaList.add("Pizza al tegamino");
        imageList.add("https://www.alma.scuolacucina.it/wp-content/uploads/2021/11/Alma_20180110_043.jpg");
        pizzaList.add("Pizza alla Palla");
    }
}