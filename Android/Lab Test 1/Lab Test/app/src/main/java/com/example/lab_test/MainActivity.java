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

        findViewById(R.id.area).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Circle circle = new Circle();
                circle.name = "Circle";
                circle.radius = 2;

                ((TextView)(findViewById(R.id.textView))).setText(String.valueOf(circle.area()));
            }
        });
        findViewById(R.id.color).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Red color = new Red();
                color.name ="Red";

                ((TextView)(findViewById(R.id.textView))).setText(String.valueOf(color.showcolor()));
            }
        });
    }
}