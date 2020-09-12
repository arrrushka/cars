package com.company;

import com.company.ferrari.Ferrari;
import com.company.porsche.*;

public class CarFactory {
    public static Car buildCar(CarModels model)
    {
        Car car = null;
        switch (model)
        {
            case FERRARI:
                car = new Ferrari();
                break;

            case PORSCHE:
                car = new Porsche();
                break;
            default:
                car = new Ferrari();
                break;
        }
        return car;
    }
}
