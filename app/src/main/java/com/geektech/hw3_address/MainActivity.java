package com.geektech.hw3_address;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        recyclerView = findViewById(R.id.recycler_view);
        AddressAdapter adapter = new AddressAdapter(address);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        address = new ArrayList<>();
        address.add("Шопокова");
        address.add("Павлова");
        address.add("Кирова");
        address.add("Западная");
        address.add("Жибек-Жолу");
        address.add("Проспект Чуй");
        address.add("Фрунзе");
        address.add("Пионерская");
        address.add("Лебединовка");
        address.add("Литвинова");
        address.add("Алыкула Осмонова");
        address.add("Чынгыза Айтматова");
        address.add("Дружбы");
        address.add("Держинская");
        address.add("Южная");
        address.add("Шевченко");
        address.add("Крупская");
        address.add("Колхозная");
        address.add("1 Мая");
        address.add("Октябрьская");
        address.add("Красноамрейская");
    }

}