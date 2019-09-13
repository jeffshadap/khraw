package com.khraw;

public class Project5 {
    public static void main(String[] args) {
        double charge = calculateCharge(160,"Express");
            System.out.println(charge);
        }

    public static double calculateCharge(int weight, String mailType) {
        double charge = 0.0;
        if (weight <= 100) {
            if (mailType == "Ordinary") charge = 50;
            if (mailType == "Express") charge = 80;
        }
        if (weight >= 101 && weight <= 500) {
            if (mailType == "Ordinary") charge = (40.0 / 100) * weight;
            if (mailType == "Express") charge = (70.0 / 100) * weight;
        }
        if (weight >= 501) {
            if (mailType == "Ordinary") charge = (35.0 / 100) * weight;
            if (mailType == "Express") charge = (65.0 / 100) * weight;

        }
        return charge;
    }
}