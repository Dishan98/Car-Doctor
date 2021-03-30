package com.example.cardoctor;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Date;
import java.sql.Time;
import java.util.Calendar;

public class form extends AppCompatActivity {

    EditText oil_filter_date, air_filter, service, tyre_check, battery_check, engine_tuneup,shock, fluid_coolant,transmission_fluid, steering_fluid, wiper_blade, lights,technical;
    DatePickerDialog datePickerDialog;
    DatabaseHelper db;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        oil_filter_date = (EditText) findViewById(R.id.oil_filter_date);
        air_filter = (EditText) findViewById(R.id.air_filter_date);
        service = (EditText) findViewById(R.id.last_service);
        tyre_check = (EditText) findViewById(R.id.tyreCheck);
        battery_check = (EditText) findViewById(R.id.battery_check);
        engine_tuneup = (EditText) findViewById(R.id.engine_tuneup);
        shock = (EditText) findViewById(R.id.shock);
        fluid_coolant = (EditText) findViewById(R.id.fluid_coolent);
        //transmission_fluid = (EditText) findViewById(R.id.transmission_fluid);
        steering_fluid = (EditText) findViewById(R.id.steering_fluid);
        technical = (EditText) findViewById(R.id.technical_visit);
        wiper_blade = (EditText) findViewById(R.id.wiper_blade);
        lights = (EditText) findViewById(R.id.lights);
        btnSave = (Button) findViewById(R.id.save);


        Calendar calendar = Calendar.getInstance();
        final int day = calendar.get(Calendar.DAY_OF_MONTH);
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);

        oil_filter_date.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                datePickerDialog = new DatePickerDialog(form.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        oil_filter_date.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

        air_filter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                datePickerDialog = new DatePickerDialog(form.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        air_filter.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

        service.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                datePickerDialog = new DatePickerDialog(form.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        service.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

        tyre_check.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                datePickerDialog = new DatePickerDialog(form.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        tyre_check.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

        battery_check.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                datePickerDialog = new DatePickerDialog(form.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        battery_check.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

        engine_tuneup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                datePickerDialog = new DatePickerDialog(form.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        engine_tuneup.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

        shock.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                datePickerDialog = new DatePickerDialog(form.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        shock.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

        fluid_coolant.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                datePickerDialog = new DatePickerDialog(form.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        fluid_coolant.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

//        transmission_fluid.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                datePickerDialog = new DatePickerDialog(form.this, new DatePickerDialog.OnDateSetListener() {
//                    @Override
//                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
//                        transmission_fluid.setText(dayOfMonth+"/"+(month+1)+"/"+year);
//                    }
//                },year,month,day);
//                datePickerDialog.show();
//            }
//        });

        steering_fluid.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                datePickerDialog = new DatePickerDialog(form.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        steering_fluid.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

        wiper_blade.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                datePickerDialog = new DatePickerDialog(form.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        wiper_blade.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

        lights.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                datePickerDialog = new DatePickerDialog(form.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        lights.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

        technical.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                datePickerDialog = new DatePickerDialog(form.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        technical.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = oil_filter_date.getText().toString();
                String s2 = air_filter.getText().toString();
                String s3 = service.getText().toString();
                String s4 = tyre_check.getText().toString();
                String s5 = battery_check.getText().toString();
                String s6 = engine_tuneup.getText().toString();
                String s7 = shock.getText().toString();
                String s8 = fluid_coolant.getText().toString();
                String s9 = transmission_fluid.getText().toString();
                String s10 = steering_fluid.getText().toString();
                String s11 = technical.getText().toString();
                String s12 = wiper_blade.getText().toString();
                String s13 = lights.getText().toString();

                Boolean insert = db.insertDates(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13);
                if (insert == true) {
                    Toast.makeText(getApplicationContext(), "Successfully Added!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(form.this, dashboard.class);
                    startActivity(intent);
                }
            }
        });
    }
}
