package com.codetalenta.eclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnMhs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMhs = findViewById(R.id.btnMahasiswa);
        btnMhs.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,HomePageActivity.class);
            startActivity(intent);
        });
    }
}