package com.company;

import com.company.ferrari.Ferrari;
import com.company.ferrari.FerrariFactory;
import com.company.ferrari.FerrariModels;
import com.company.porsche.Porsche;
import com.company.porsche.PorscheFactory;
import com.company.porsche.PorscheModels;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int x = 0;
        int m = 0;
        int p = 0;
        String s = "";
        String color = "";
        Double engine = 0.0;
        Car carModels = null;
        Ferrari ferrariModels;
        Porsche porscheModels;
        CarBuilder builder = new CarBuilder();
        FerrariFactory ferrariFactory = new FerrariFactory();
        PorscheFactory porscheFactory = new PorscheFactory();
        CarFactory carFactory = new CarFactory();


        Scanner in = new Scanner(System.in);
        System.out.print("Choose a color: ");
        color = in.next();
        builder.paintCar(color);

        System.out.print("Choose an engine volume: ");
        engine = in.nextDouble();
        builder.setEngine(engine);


        while (!"3".equals(s)) {
            System.out.println("1. Ferrari ");
            System.out.println("2. Porsche ");
            System.out.println("3. Exit");
            s = scan.next();

            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Uncorrect");
            }

            switch (x) {
                case 1:
                    carModels = carFactory.buildCar(CarModels.FERRARI);
                    break;
                case 2:
                    carModels = carFactory.buildCar(CarModels.PORSCHE);
                    break;
            }
        }

        if (x == 1) {
            while (!"4".equals(s)) {
                System.out.println("1. California ");
                System.out.println("2. Enzo ");
                System.out.println("3. Testarossa");
                System.out.println("4. Exit");
                s = scan.next();

                try {
                    m = Integer.parseInt(s);
                } catch (NumberFormatException e) {
                    System.out.println("Uncorrect");
                }

                switch (m) {
                    case 1:
                        ferrariModels = ferrariFactory.buildFerrari(FerrariModels.CALIFORNIA);
                        break;
                    case 2:
                        ferrariModels = ferrariFactory.buildFerrari(FerrariModels.ENZO);
                        break;
                    case 3:
                        ferrariModels = ferrariFactory.buildFerrari(FerrariModels.TESTAROSSA);
                        break;
                }
            }
        } else if (x == 2) {
            while (!"4".equals(s)) {
                System.out.println("1. Cayenne ");
                System.out.println("2. Panamera ");
                System.out.println("3. Macan");
                System.out.println("4. Exit");
                s = scan.next();

                try {
                    p = Integer.parseInt(s);
                } catch (NumberFormatException e) {
                    System.out.println("Uncorrect");
                }

                switch (p) {
                    case 1:
                        porscheModels = porscheFactory.buildPorsche(PorscheModels.CAYENNE);
                        break;
                    case 2:
                        porscheModels = porscheFactory.buildPorsche(PorscheModels.PANAMERA);
                        break;
                    case 3:
                        porscheModels = porscheFactory.buildPorsche(PorscheModels.MACAN);
                        break;
                }
            }
        }
        System.out.println(carModels.toString());

    }
}
