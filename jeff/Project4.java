package com.khraw.jeff;

import javafx.util.Pair;

public class Project4 {
    public static void main(String args[]) {
        int basicSalary = 10000;
        Pair<Double, Double> percents = getPercents(basicSalary);
        double dearnessAllowance = basicSalary * percents.getKey();
        double specialAllowance = basicSalary * percents.getValue();
        double grossSalary = basicSalary + dearnessAllowance + specialAllowance;
        System.out.println(basicSalary + " -" + dearnessAllowance + " - " + specialAllowance + " -" + grossSalary);
    }

    public static Pair getPercents(int basicSalary) {
        double dearness=0.0, special=0.0;
        if (basicSalary <= 10000){
            dearness = 15.0;
            special = 5.0;
        }
        if (basicSalary >= 10001 && basicSalary <= 20000){
            dearness = 20.0;
            special = 8.0;
        }
        if (basicSalary >= 20001 && basicSalary <= 30000){
            dearness = 25.0;
            special = 10.0;
        }
        if (basicSalary >= 30001){
            dearness = 30.0;
            special = 12.0;
        }
        return new Pair<Double, Double>(dearness, special);
    }

}
