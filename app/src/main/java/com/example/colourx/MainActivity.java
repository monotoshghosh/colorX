package com.example.colourx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout screen;
    Button red;
    Button blue;
    Button green;
    Button yellow;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        red=findViewById(R.id.red);
        blue=findViewById(R.id.blue);
        green=findViewById(R.id.green);
        yellow=findViewById(R.id.yellow);
        screen=findViewById(R.id.scr);
        
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Blue Button Pressed", Toast.LENGTH_SHORT).show();
                screen.setBackgroundResource(R.color.blue);
            }

        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Red Buttom Pressed", Toast.LENGTH_SHORT).show();
                screen.setBackgroundResource(R.color.red);
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Green Button Pressed", Toast.LENGTH_SHORT).show();
                screen.setBackgroundResource(R.color.green);
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setBackgroundResource(R.color.yellow);
            }
        });
        
    }
}