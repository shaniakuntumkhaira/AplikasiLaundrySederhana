package com.shania.aplikasiminumankekinian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnChocolate = findViewById(R.id.btn_chocolate);
        Button btnFruit = findViewById(R.id.btn_fruit);
        Button btnCoffee = findViewById(R.id.btn_coffee);

        btnChocolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.btn_chocolate ) {
                    Intent intent = new Intent(MainActivity.this, ChocolateActivity.class);
                    startActivity(intent);
                }
            }
        });

        btnFruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.btn_fruit) {
                    Intent intent = new Intent(MainActivity.this, FruitActivity.class);
                    startActivity(intent);
                }
            }
        });

        btnCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.btn_coffee ) {
                    Intent intent = new Intent(MainActivity.this, CoffeeActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}