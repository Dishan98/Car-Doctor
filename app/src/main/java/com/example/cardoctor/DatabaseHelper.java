package com.example.cardoctor;

import android.accessibilityservice.GestureDescription;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.Date;



public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context){
        super(context, "Vehicle.db", null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table vehicle(registration_no text primary key, make text, model text, mileage text)");
        db.execSQL("Create table maintenance(oil_filter text, air_filter text, last_service text, tyre_check text, battery_check text, engine_tuneup text, shock text, " +
                "fluid_and_coolant text, transmission_fluid text, steering_fluid text, technical_visit text, wiper_blades text, lights text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists vehicle");
        db.execSQL("drop table if exists maintenance");
    }

    public boolean insert(String registration_no, String make, String model, String mileage){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("registration_no",registration_no);
        contentValues.put("make",make);
        contentValues.put("model",model);
        contentValues.put("mileage",mileage);
        long ins = db.insert("vehicle",null,contentValues);
        if(ins==-1){
            return false;
        }else{
            return true;
        }
    }

    public boolean checkVehicle(String reg_no){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("Select * from vehicle where registration_no=?",new String[]{reg_no});
        if(cursor.getCount()>0){
            return false;
        }else{
            return true;
        }
    }

    public boolean insertDates(String oil_filter, String air_filter, String last_service, String tyre_check, String battery_check, String engine, String shock, String fluid_coolant,
                               String transmission, String steering, String technical, String wiper, String lights){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("oil_filter", oil_filter);
        contentValues.put("air_filter", air_filter);
        contentValues.put("last_service", last_service);
        contentValues.put("tyre_check", tyre_check);
        contentValues.put("battery_check", battery_check);
        contentValues.put("engine", engine);
        contentValues.put("shock", shock);
        contentValues.put("fluid_coolant", fluid_coolant);
        contentValues.put("transmission", transmission);
        contentValues.put("steering", steering);
        contentValues.put("technical", technical);
        contentValues.put("wiper", wiper);
        contentValues.put("lights", lights);
        long ins = db.insert("maintenance",null,contentValues);
        if(ins==-1){
            return false;
        }else{
            return true;
        }
    }
}
