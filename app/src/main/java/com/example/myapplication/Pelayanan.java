package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pelayanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelayanan);

        androidx.appcompat.widget.Toolbar btnback = findViewById(R.id.btnback);
        setSupportActionBar(btnback);
        btnback.setLogo(R.drawable.ic_baseline_arrow_back_24);

        Button tunggakan = findViewById(R.id.tunggakan);
        Button permohonan = findViewById(R.id.permohonan);
        Button pembayaran = findViewById(R.id.pembayaran);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        btnback.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        tunggakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Pelayanan.this, cektunggakan.class));
            }
        });

        permohonan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Pelayanan.this, permohonanbaru.class));
            }
        });

        pembayaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Pelayanan.this, com.example.myapplication.pembayaran.class));
            }
        });
    }
}