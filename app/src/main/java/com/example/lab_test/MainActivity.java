package com.example.lab_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.demo1.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();

                motorcycle motorcycle = new motorcycle();
                motorcycle.drive();

                ((TextView)(findViewById(R.id.tv))).setText(String.valueOf(motorcycle.fule));
            }
        });

    }
}