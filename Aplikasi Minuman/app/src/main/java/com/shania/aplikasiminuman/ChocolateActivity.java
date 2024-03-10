package com.shania.aplikasiminuman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ChocolateActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chocolate);

        Button btnMiloLavaCrunchy = findViewById(R.id.btn_milo_lava_crunchy);
        Button btnOvaltine = findViewById(R.id.btn_ovaltine);
        Button btnChocoHazelnut = findViewById(R.id.btn_choco_hazelnut);
        Button btnChocolateBelgian = findViewById(R.id.btn_chocolate_belgian);
        Button btnChocolateOriginal = findViewById(R.id.btn_chocolate_original);

        // Menambahkan listener onClick untuk setiap tombol
        btnMiloLavaCrunchy.setOnClickListener(this);
        btnOvaltine.setOnClickListener(this);
        btnChocoHazelnut.setOnClickListener(this);
        btnChocolateBelgian.setOnClickListener(this);
        btnChocolateOriginal.setOnClickListener(this);

        btnMiloLavaCrunchy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menampilkan deskripsi "Coffee Caramel" pada TextView yang sesuai
                Intent intent = new Intent(ChocolateActivity.this, DetailActivity.class);
                intent.putExtra("itemName", "Milo Lava Crunchy");
                intent.putExtra("itemPrice","Rp. 14.000");
                intent.putExtra("itemSize","Reguler");
                startActivity(intent);
            }
        });
        btnOvaltine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChocolateActivity.this, DetailActivity.class);
                intent.putExtra("itemName", "Ovaltine");
                intent.putExtra("itemPrice", "Rp. 12.000");
                intent.putExtra("itemSize", "Reguler");
                startActivity(intent);
            }
        });
        btnChocoHazelnut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChocolateActivity.this, DetailActivity.class);
                intent.putExtra("itemName", "Choco Hazelnut");
                intent.putExtra("itemPrice", "Rp. 11.000");
                intent.putExtra("itemSize", "Reguler");
                startActivity(intent);
            }
        });
        btnChocolateBelgian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChocolateActivity.this, DetailActivity.class);
                intent.putExtra("itemName", "Chocolate Belgian");
                intent.putExtra("itemPrice", "Rp. 12.000");
                intent.putExtra("itemSize", "Reguler");
                startActivity(intent);
            }
        });
        btnChocolateOriginal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChocolateActivity.this, DetailActivity.class);
                intent.putExtra("itemName", "Chocolate Original");
                intent.putExtra("itemPrice", "Rp. 11.000");
                intent.putExtra("itemSize", "Reguler");
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}
