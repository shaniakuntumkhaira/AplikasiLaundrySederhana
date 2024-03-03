package com.shania.aplikasilaundrysederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etJumlahPerKilo1, etJumlahPerKilo2, etJumlahPerKilo3;
    private TextView tvReceipt, tvHargaPerKilo;
    private RadioGroup radioGroup;
    private RadioButton rbMember, rbNonMember;
    private Button btnProses;

    // Harga barang per kg
    private final int Selimut = 20000;
    private final int Pakaianbiasa = 5000;
    private final int Boneka = 15000;

    // Biaya admin per barang
    private final int biayaAdmin1 = 2000;
    private final int biayaAdmin2 = 2500;
    private final int biayaAdmin3 = 3000;

    // Diskon untuk membership
    private final double diskonMember = 0.05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etJumlahPerKilo1 = findViewById(R.id.etJumlahPerKilo1);
        etJumlahPerKilo2 = findViewById(R.id.etJumlahPerKilo2);
        etJumlahPerKilo3 = findViewById(R.id.etJumlahPerKilo3);
        tvReceipt = findViewById(R.id.tvReceipt);
        tvHargaPerKilo = findViewById(R.id.tvHargaPerKilo);
        radioGroup = findViewById(R.id.radioGroup);
        rbMember = findViewById(R.id.rbMember);
        rbNonMember = findViewById(R.id.rbNonMember);
        btnProses = findViewById(R.id.btnProses);

        tvHargaPerKilo.setText("Harga per kg :\n" +
                "Selimut : Rp " + Selimut + "\n" +
                "Pakaian biasa : Rp " + Pakaianbiasa + "\n" +
                "Boneka : Rp " + Boneka);

        btnProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { hitungTotalHarga();
            }
        });
    }
    private void hitungTotalHarga() {
        int totalHarga = 0;
        double diskon = 0;

        // Mengambil nilai jumlah barang per kilogram
        int JumlahPerKilo1 = Integer.parseInt(etJumlahPerKilo1.getText().toString());
        int JumlahPerKilo2 = Integer.parseInt(etJumlahPerKilo2.getText().toString());
        int JumlahPerKilo3 = Integer.parseInt(etJumlahPerKilo3.getText().toString());

        // Menghitung total harga masing-masing barang
        int totalHarga1 = JumlahPerKilo1 * Selimut;
        int totalHarga2 = JumlahPerKilo2 * Pakaianbiasa;
        int totalHarga3 = JumlahPerKilo3 * Boneka;

        int totalHargaSemuaBarang = totalHarga1 + totalHarga2 + totalHarga3;

        int totalBiayaAdmin = JumlahPerKilo1 * biayaAdmin1 + JumlahPerKilo2 * biayaAdmin2 + JumlahPerKilo3 * biayaAdmin3;

        if (rbMember.isChecked()) {
            diskon = totalHargaSemuaBarang * diskonMember;
        }
        double totalHargaSetelahDiskon = totalHargaSemuaBarang - diskon;

        // Menambahkan biaya admin
        double totalHargaFinal = totalHargaSetelahDiskon + totalBiayaAdmin;

        //Menampilkan total harga dan diskon
        tvReceipt.setText("Total Haega : Rp " + totalHarga + "\nDiskon : Rp " + diskon);

        // Menampilkan bon
        tampilkanBon(JumlahPerKilo1, JumlahPerKilo2, JumlahPerKilo3, totalHargaSemuaBarang, diskon, totalBiayaAdmin, totalHargaFinal);
    }
    // Method untuk menampilkan bon
    private void tampilkanBon(int JumlahPerKilo1, int JumlahPerKilo2, int JumlahPerKilo3, int totalHarga, double diskon, int totalBiayaAdmin, double totalHargaFinal) {
        StringBuilder bon = new StringBuilder();
        int totalHargaSemuaBarang = JumlahPerKilo1 * Selimut + JumlahPerKilo2 * Pakaianbiasa + JumlahPerKilo3 * Boneka;

        bon.append("Bon\n");
        bon.append("Nama Barang\tBanyak Barang\tTotal Harga Barang\n");
        bon.append("Selimut : \t").append(JumlahPerKilo1).append(" =\t").append(JumlahPerKilo1 * Selimut).append("\n");
        bon.append("Pakaian biasa : \t").append(JumlahPerKilo2).append(" =\t").append(JumlahPerKilo2 * Pakaianbiasa).append("\n");
        bon.append("Boneka : \t").append(JumlahPerKilo3).append(" =\t").append(JumlahPerKilo3 * Boneka).append("\n");
        bon.append("Total Harga Semua Barang :\t").append(totalHargaSemuaBarang).append("\n");
        bon.append("Admin :\t").append(totalBiayaAdmin).append("\n");
        bon.append("Diskon :\t").append(diskon).append("\n");
        bon.append("Total Bayar :\t").append(totalHargaFinal).append("\n");

        // Menampilkan bon pada TextView
        tvReceipt.setText(bon.toString());
    }
}