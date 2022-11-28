package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText display;
    Button no1;
    Button no2;
    Button no3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.et_calculator);
        no1 =findViewById(R.id.B_1);
        no2 =findViewById(R.id.B_2);
        no3 =findViewById(R.id.B_3);
    }
    

}