package com.example.rishukumar.popup;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button popup,close;
    LinearLayout lay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lay=(LinearLayout) findViewById(R.id.layou);
        popup=(Button) findViewById(R.id.button);
        close=(Button) findViewById(R.id.button2);
        popup.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
             lay.setVisibility(View.VISIBLE);
               popup.setVisibility(View.GONE);

            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lay.setVisibility(View.GONE);
                popup.setVisibility(View.VISIBLE);
            }
        });

    }
}
