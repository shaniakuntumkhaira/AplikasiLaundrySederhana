package com.shania.aplikasiminuman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class FruitActivity extends AppCompatActivity implements View.OnClickListener{
    ListView listView;
    String[] fruits = {"Virginia Berry", "Strawberry Milk", "Avocado Smoothies", "Lychee Soda", "Lemon Tea"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        // Mendapatkan referensi ke setiap tombol
        Button btnVirginiaBerry = findViewById(R.id.btn_virginia_berry);
        Button btnStrawberryMilk = findViewById(R.id.btn_strawberry_milk);
        Button btnAvocadoSmoothies = findViewById(R.id.btn_avocado_smoothies);
        Button btnLycheeSoda = findViewById(R.id.btn_lychee_soda);
        Button btnLemonTea = findViewById(R.id.btn_lemon_tea);

        // Menambahkan listener onClick untuk setiap tombol
        btnVirginiaBerry.setOnClickListener(this);
        btnStrawberryMilk.setOnClickListener(this);
        btnAvocadoSmoothies.setOnClickListener(this);
        btnLycheeSoda.setOnClickListener(this);
        btnLemonTea.setOnClickListener(this);

        btnVirginiaBerry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menampilkan deskripsi "Coffee Caramel" pada TextView yang sesuai
                Intent intent = new Intent(FruitActivity.this, DetailActivity.class);
                intent.putExtra("itemName", "Virgina Berry");
                intent.putExtra("itemPrice","Rp. 14.000");
                intent.putExtra("itemSize","Reguler");
                startActivity(intent);
            }
        });
        btnStrawberryMilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FruitActivity.this, DetailActivity.class);
                intent.putExtra("itemName", "Strawberry Milk");
                intent.putExtra("itemPrice", "Rp. 11.000");
                intent.putExtra("itemSize", "Reguler");
                startActivity(intent);
            }
        });
        btnAvocadoSmoothies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FruitActivity.this, DetailActivity.class);
                intent.putExtra("itemName", "Avocado Smoothies");
                intent.putExtra("itemPrice", "Rp. 11.000");
                intent.putExtra("itemSize", "Reguler");
                startActivity(intent);
            }
        });
        btnLycheeSoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FruitActivity.this, DetailActivity.class);
                intent.putExtra("itemName", "Lychee Soda");
                intent.putExtra("itemPrice", "Rp. 14.000");
                intent.putExtra("itemSize", "Reguler");
                startActivity(intent);
            }
        });
        btnLemonTea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FruitActivity.this, DetailActivity.class);
                intent.putExtra("itemName", "Lemon Tea");
                intent.putExtra("itemPrice", "Rp. 19.000");
                intent.putExtra("itemSize", "Reguler");
                startActivity(intent);
            }
        });
    }
    @Override
    public void onClick(View view) {

    }
}