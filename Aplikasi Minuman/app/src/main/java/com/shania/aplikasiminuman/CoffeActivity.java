package com.shania.aplikasiminuman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class CoffeActivity extends AppCompatActivity implements OnClickListener{
    ListView listView;
    String[] coffees = {"Coffee Caramel", "Coffee Cookies & Cream", "Coffee Hazelnut", "Coffee Tiramisu", "Es Kopi Susu Pandan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffe);

        // Mendapatkan referensi ke setiap tombol
        Button btnCoffeeCaramel = findViewById(R.id.btn_coffee_caramel);
        Button btnCoffeeCookiesCream = findViewById(R.id.btn_coffee_cookies_cream);
        Button btnCoffeeHazelnut = findViewById(R.id.btn_coffee_hazelnut);
        Button btnCoffeeTiramisu = findViewById(R.id.btn_coffee_tiramisu);
        Button btnEsKopiSusuPandan = findViewById(R.id.btn_coffee_es_kopi_susu_pandan);

        // Menambahkan listener onClick untuk setiap tombol
        btnCoffeeCaramel.setOnClickListener(this);
        btnCoffeeCookiesCream.setOnClickListener(this);
        btnCoffeeHazelnut.setOnClickListener(this);
        btnCoffeeTiramisu.setOnClickListener(this);
        btnEsKopiSusuPandan.setOnClickListener(this);

        btnCoffeeCaramel.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menampilkan deskripsi "Coffee Caramel" pada TextView yang sesuai
                Intent intent = new Intent(CoffeActivity.this, DetailActivity.class);
                intent.putExtra("itemName", "Coffee Caramel");
                intent.putExtra("itemPrice","Rp. 11.000");
                intent.putExtra("itemSize","Reguler");
                startActivity(intent);
            }
        });
        btnCoffeeCookiesCream.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoffeActivity.this, DetailActivity.class);
                intent.putExtra("itemName", "Coffee Cookies and Cream");
                intent.putExtra("itemPrice", "Rp. 11.000");
                intent.putExtra("itemSize", "Reguler");
                startActivity(intent);
            }
        });
        btnCoffeeHazelnut.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoffeActivity.this, DetailActivity.class);
                intent.putExtra("itemName", "Coffee Hazelnut");
                intent.putExtra("itemPrice", "Rp. 10.000");
                intent.putExtra("itemSize", "Reguler");
                startActivity(intent);
            }
        });
        btnCoffeeTiramisu.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoffeActivity.this, DetailActivity.class);
                intent.putExtra("itemName", "Coffee Tiramisu");
                intent.putExtra("itemPrice", "Rp. 11.000");
                intent.putExtra("itemSize", "Reguler");
                startActivity(intent);
            }
        });
        btnEsKopiSusuPandan.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoffeActivity.this, DetailActivity.class);
                intent.putExtra("itemName", "Es Kopi Susu Pandan");
                intent.putExtra("itemPrice", "Rp. 15.000");
                intent.putExtra("itemSize", "Reguler");
                startActivity(intent);
            }
        });
    }
    @Override
    public void onClick(View view) {

    }
}