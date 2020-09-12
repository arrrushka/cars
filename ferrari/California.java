package com.company.ferrari;

public class California extends Ferrari {
    public California() {
        super(FerrariModels.CALIFORNIA);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("California");
    }
}
