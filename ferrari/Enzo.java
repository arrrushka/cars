package com.company.ferrari;

import com.company.ferrari.Ferrari;
import com.company.ferrari.FerrariModels;

public class Enzo extends Ferrari {
    public Enzo() {
        super(FerrariModels.ENZO);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Enzo");
    }
}
