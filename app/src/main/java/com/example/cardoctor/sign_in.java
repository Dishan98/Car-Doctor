package com.example.cardoctor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.state.State;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.Helper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class sign_in extends AppCompatActivity {

    EditText txtRegistration_no;
    ImageButton btnIn;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        db = new DatabaseHelper(this);
        txtRegistration_no = findViewById(R.id.txt_registration_no);
        btnIn = findViewById(R.id.btn_in);
        btnIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String reg_no = txtRegistration_no.getText().toString();
                Boolean checkReg_No = db.checkVehicle(reg_no);
                if (checkReg_No == true) {
                    Toast.makeText(getApplicationContext(),"Login Successfully!",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(sign_in.this, dashboard.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"No such vehicle added!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void addNewVehicle(View view){
        Intent intent = new Intent(sign_in.this,sign_up.class);
        startActivity(intent);
    }
}