package com.company.ferrari;

import com.company.Car;
import com.company.CarModels;
import com.company.porsche.PorscheModels;

public class Ferrari extends Car {
    public Ferrari(FerrariModels model){
        this.model = model;
    }
    private FerrariModels model = null;

    public Ferrari() {
        super(CarModels.FERRARI);
        construct();
    }

    //getters and setters

    @Override
    protected void construct() {
        System.out.println("Ferrari ");
    }

}
