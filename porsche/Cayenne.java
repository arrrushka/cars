package com.company.porsche;

import com.company.ferrari.FerrariModels;

public class Cayenne extends Porsche {
    public Cayenne() {
        super(PorscheModels.CAYENNE);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Cayenne");
    }
}
