package com.catfoot.mb.bean;

import java.util.Date;

public class Car {
    private int id;
    private int carNum;
    private String brand;
    private double guidePrice;
    private Date produceTime;
    private String catType;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getGuidePrice() {
        return guidePrice;
    }

    public void setGuidePrice(double guidePrice) {
        this.guidePrice = guidePrice;
    }

    public Date getProduceTime() {
        return produceTime;
    }

    public void setProduceTime(Date produceTime) {
        this.produceTime = produceTime;
    }

    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carNum=" + carNum +
                ", brand='" + brand + '\'' +
                ", guidePrice=" + guidePrice +
                ", produceTime=" + produceTime +
                ", catType='" + catType + '\'' +
                '}';
    }
}
