package com.example.cardoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sign_up extends AppCompatActivity {

    DatabaseHelper db;
    EditText reg_no, make, model, mileage;
    Button btnAddVehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        db = new DatabaseHelper(this);
        reg_no = findViewById(R.id.reg_no);
        make = findViewById(R.id.make);
        model = findViewById(R.id.model);
        mileage = findViewById(R.id.mileage);
        btnAddVehicle = findViewById(R.id.btn_add);
        btnAddVehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = reg_no.getText().toString();
                String s2 = make.getText().toString();
                String s3 = model.getText().toString();
                String s4 = mileage.getText().toString();

                if(s1.equals("") || s2.equals("") || s3.equals("") || s4.equals("")){
                    Toast.makeText(getApplicationContext(),"Fields are empty!",Toast.LENGTH_SHORT).show();
                }else{
                    Boolean check = db.checkVehicle(s1);
                    if(check==true){
                        Boolean insert = db.insert(s1,s2,s3,s4);
                        if(insert==true){
                            Toast.makeText(getApplicationContext(),"Successfully Added!",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(sign_up.this,form.class);
                            startActivity(intent);
                        }
                    }else{
                        Toast.makeText(getApplicationContext(),"Vehicle Already Added!",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }

    public void back(View view){
        Intent intent = new Intent(sign_up.this, sign_in.class);
        startActivity(intent);
    }

}