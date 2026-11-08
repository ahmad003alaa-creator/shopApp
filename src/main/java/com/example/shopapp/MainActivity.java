package com.example.shopapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2)); // two columns

        String name = "Bitzwolf B-CC1 Camera 1080P Hd Webcame";
        List<Product> list = new ArrayList<>();
        list.add(new Product(name, "US$48.89", R.drawable.ic_camera));
        list.add(new Product(name, "US$55.89", R.drawable.ic_camera));
        list.add(new Product(name, "US$78.89", R.drawable.ic_camera));
        list.add(new Product(name, "US$88.55", R.drawable.ic_camera));
        list.add(new Product(name, "US$23.67", R.drawable.ic_camera));
        list.add(new Product(name, "US$44.89", R.drawable.ic_camera));

        recyclerView.setAdapter(new ProductAdapter(list));
    }
}
