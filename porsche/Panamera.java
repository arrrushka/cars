package com.company.porsche;

public class Panamera extends Porsche {
    public Panamera() {
        super(PorscheModels.PANAMERA);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Panamera");
    }
}
