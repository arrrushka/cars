package com.company;

import com.company.ferrari.California;
import com.company.ferrari.Ferrari;
import com.company.porsche.Porsche;

import java.awt.*;

public class CarBuilder {
    Car car;

    public void paintCar(String color) { car.setColor(color); }
    public void setEngine(Double engineVolume) { car.setEngineVolume(engineVolume); }

}
