package com.khraw;

import java.util.Scanner;

public class Project9 {
    public static void main(String[] args) {
        int years;
        int showroomPrice;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter showroom price");
        showroomPrice = sc.nextInt();
        System.out.println("Enter years");
        years = sc.nextInt();

        double depreciationRate = getDepreciationRate(years);
        double depreciatedValue = depreciationRate * showroomPrice;
        double amountPaid = showroomPrice - depreciatedValue;
    }


    public static double getDepreciationRate(int years) {
        double rate = 0.0;
        switch (years) {
            case 1:
                rate = 0.1;
                break;
            case 2:
                rate = 0.2;
                break;
            case 3:
                rate = 0.3;
                break;
            case 4:
                rate = 0.5;
                break;
            default:
                rate = 0.6;
        }
        return rate;
    }


}
