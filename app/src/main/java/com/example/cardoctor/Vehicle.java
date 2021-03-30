package com.example.cardoctor;

public class Vehicle {

    private String make;
    private String model;
    private String registration_no;
    private int mileage;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getRegistration_no() {
        return registration_no;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRegistration_no(String registration_no) {
        this.registration_no = registration_no;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
