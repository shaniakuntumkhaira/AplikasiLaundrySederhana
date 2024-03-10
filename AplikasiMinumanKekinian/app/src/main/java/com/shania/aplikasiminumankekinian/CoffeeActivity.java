package com.shania.aplikasiminumankekinian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CoffeeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

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

        btnCoffeeCaramel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menampilkan deskripsi "Coffee Caramel" pada TextView yang sesuai
                Intent intent = new Intent(CoffeeActivity.this, DetailActivity.class);
                intent.putExtra("itemName", "Coffee Caramel");
                intent.putExtra("itemPrice","Rp. 11.000");
                intent.putExtra("itemSize","Reguler(Long +Rp. 2.000)");
                startActivity(intent);
            }
        });
        btnCoffeeCookiesCream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoffeeActivity.this, DetailActivity.class);
                intent.putExtra("itemName", "Coffee Cookies and Cream");
                intent.putExtra("itemPrice", "Rp. 11.000");
                intent.putExtra("itemSize", "Reguler(Long +Rp. 2.000)");
                startActivity(intent);
            }
        });
        btnCoffeeHazelnut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoffeeActivity.this, DetailActivity.class);
                intent.putExtra("itemName", "Coffee Hazelnut");
                intent.putExtra("itemPrice", "Rp. 10.000");
                intent.putExtra("itemSize", "Reguler(Long +Rp. 3.000)");
                startActivity(intent);
            }
        });
        btnCoffeeTiramisu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoffeeActivity.this, DetailActivity.class);
                intent.putExtra("itemName", "Coffee Tiramisu");
                intent.putExtra("itemPrice", "Rp. 11.000");
                intent.putExtra("itemSize", "Reguler(Long +Rp. 2.000)");
                startActivity(intent);
            }
        });
        btnEsKopiSusuPandan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoffeeActivity.this, DetailActivity.class);
                intent.putExtra("itemName", "Es Kopi Susu Pandan");
                intent.putExtra("itemPrice", "Rp. 15.000");
                intent.putExtra("itemSize", "Reguler(Long +Rp. 2.000)");
                startActivity(intent);
            }
        });
    }
    @Override
    public void onClick(View view) {

    }
}