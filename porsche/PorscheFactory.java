package com.company.porsche;

import com.company.Car;
import com.company.ferrari.California;
import com.company.ferrari.Enzo;
import com.company.ferrari.FerrariModels;
import com.company.ferrari.Testarossa;

public class PorscheFactory {
    public static Porsche buildPorsche(PorscheModels model)
    {
        Porsche porsche = null;
        switch (model)
        {
            case CAYENNE:
                porsche = new Cayenne();
                break;

            case PANAMERA:
                porsche = new Panamera();
                break;

            case MACAN:
                porsche = new Macan();
                break;

            default:
                porsche = new Cayenne();
                break;
        }
        return porsche;
    }
}
