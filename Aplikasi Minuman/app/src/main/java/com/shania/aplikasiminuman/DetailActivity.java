package com.shania.aplikasiminuman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        // Mendapatkan data yang dikirim dari aktivitas sebelumnya
        String itemName = getIntent().getStringExtra("itemName");
        String itemPrice = getIntent().getStringExtra("itemPrice");
        String itemSize = getIntent().getStringExtra("itemSize");

        // Menampilkan data pada TextView di layout detail
        TextView textName = findViewById(R.id.text_name);
        TextView textPrice = findViewById(R.id.text_price);
        TextView textSize = findViewById(R.id.text_size);

        textName.setText(itemName);
        textPrice.setText(itemPrice);
        textSize.setText(itemSize);

        Button btnShare = findViewById(R.id.btn_share);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuat teks yang akan dibagikan
                String shareText = "Nama: " + itemName +
                        "\nHarga: " + itemPrice + "\nUkuran: " + itemSize;

                // Membuat intent untuk berbagi teks
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);
                startActivity(Intent.createChooser(shareIntent, "Bagikan melalui"));
            }
        });
    }
}