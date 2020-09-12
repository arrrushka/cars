package com.company.porsche;

import com.company.Car;
import com.company.CarModels;
import com.company.ferrari.FerrariModels;

import java.awt.*;

public class Porsche extends Car {
    public Porsche(PorscheModels model){
        this.model = model;
    }

    private PorscheModels model = null;

    //getters and setters

    public Porsche() {
        super(CarModels.PORSCHE);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Porsche ");
    }
}
