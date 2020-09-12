package com.company.porsche;

public class Macan extends Porsche {
    public Macan() {
        super(PorscheModels.MACAN);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Macan");
    }
}
