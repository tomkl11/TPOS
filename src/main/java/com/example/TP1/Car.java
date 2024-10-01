package com.example.TP1;

import java.util.Date;

public class Car {
    private String plateNumber;
    private String brand;
    private double price;
    boolean rent = false;
    Date dateBegin;
    Date dateEnd;

    public Car() {
        this.brand = "";
        this.price = 0;
        this.rent = false;


    }

    public Date getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Car(String plateNumber, String brand, double price) {
        setPlateNumber(plateNumber);
        this.brand = brand;
        this.price = price;
    }
    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{plateNumber:" + plateNumber +
                ", brand:'" + brand + '\'' +
                ", price:" + price +
                '}';
    }

    public void setRent(boolean isRent) {
        this.rent = isRent;
    }
}
