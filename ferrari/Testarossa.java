package com.company.ferrari;

import com.company.ferrari.Ferrari;
import com.company.ferrari.FerrariModels;

public class Testarossa extends Ferrari {
    public Testarossa() {
        super(FerrariModels.TESTAROSSA);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Testarossa");
    }
}
