package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class cektunggakan extends AppCompatActivity {

    private TextInputLayout cektunggakan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cektunggakan);

        androidx.appcompat.widget.Toolbar btnback = findViewById(R.id.btnback);
        setSupportActionBar(btnback);
        btnback.setLogo(R.drawable.ic_baseline_arrow_back_24);

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

        cektunggakan = findViewById(R.id.cektunggakan);
        Button btncari = findViewById(R.id.btncari);

        btncari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(com.example.myapplication.cektunggakan.this, rekamjejak.class));
            }
        });

    }

    private boolean validateNOP(){
    String nop = cektunggakan.getEditText().getText().toString().trim();

        if (nop.isEmpty()){
            cektunggakan.setError("Tidak Boleh Kosong");
            return false;
        } else if (nop.length() < 18) {
            cektunggakan.setError("NOP Kurang");
            return false;
        } else {
            cektunggakan.setError(null);
            return true;
        }
    }

}