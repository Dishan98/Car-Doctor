package com.example.cardoctor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class dashboard extends AppCompatActivity {

    CardView one_month, three_months, six_months;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        one_month = findViewById(R.id.one_month);
        three_months = findViewById(R.id.three_months);
        six_months = findViewById(R.id.six);

        one_month.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this,one_month.class);
                startActivity(intent);
            }
        });

        three_months.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this,three_months.class);
                startActivity(intent);
            }
        });

        six_months.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this,six_months.class);
                startActivity(intent);
            }
        });
    }
}