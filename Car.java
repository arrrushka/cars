package com.company;

import java.awt.*;

public abstract class Car {
    public CarModels model = null;
    private Double engineVolume;
    private String color;

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(){
    }

    public Car(CarModels model){
        this.model=model;
    }

    public Car(CarModels model, String color, Double engineVolume){
        this.model=model;
        setColor(color);
        setEngineVolume(engineVolume);
    }

    protected abstract void construct();

    @Override
    public String toString() {
        return "Model: " + model + " has volume " + engineVolume + ", in " + color + " color" + '\'';
    }

}
