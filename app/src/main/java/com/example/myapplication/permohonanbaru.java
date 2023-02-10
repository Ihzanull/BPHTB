package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class permohonanbaru extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permohonanbaru);

        Button kirim = findViewById(R.id.kirimpb);

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

        kirim.setOnClickListener(view -> startActivity(new Intent(permohonanbaru.this, payment.class)));
    }
}