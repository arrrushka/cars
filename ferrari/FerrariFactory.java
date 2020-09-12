package com.company.ferrari;

import com.company.Car;

public class FerrariFactory {
    public static Ferrari buildFerrari(FerrariModels model)
    {
        Ferrari ferrari = null;
        switch (model)
        {
            case CALIFORNIA:
                ferrari = new California();
                break;

            case ENZO:
                ferrari = new Enzo();
                break;

            case TESTAROSSA:
                ferrari = new Testarossa();
                break;

            default:
                ferrari = new California();
                break;
        }
        return ferrari;
    }
}
