package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputLayout;

public class CetakSTS extends AppCompatActivity {

    private TextInputLayout kodepembayaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cetak_sts);

        androidx.appcompat.widget.Toolbar btnback = findViewById(R.id.btnback);
        setSupportActionBar(btnback);
        btnback.setLogo(R.drawable.ic_baseline_arrow_back_24);

        if (getSupportActionBar() !=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        btnback.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        kodepembayaran = findViewById(R.id.kodepembayaran);
    }

    private boolean validatekode(){
        String kode = kodepembayaran.getEditText().getText().toString().trim();

        if (kode.isEmpty()){
            kodepembayaran.setError("Tidak Boleh Kosong");
            return false;
        } else {
            kodepembayaran.setError(null);
            return true;
        }
    }
}