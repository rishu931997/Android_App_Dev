package com.example.rishukumar.plus_minus_firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter;
    Button add,sub,reset;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter=0;
        add=(Button) findViewById(R.id.button);
        sub=(Button) findViewById(R.id.button2);
        reset=(Button) findViewById(R.id.button3);
        display=(TextView) findViewById(R.id.textView);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                counter++;
                display.setText("Your total is : " + counter);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                counter--;
                display.setText("Your total is : " + counter);
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter=0;
                display.setText("Your total is : "+ counter);
            }
        });
    }
}
