package com.khraw;

public class Project4 {
    public static void main(String args[]) {
        int basicSalary = 10000;
        double grossSalary = calculateGrossSalary(basicSalary);
        double dearnessAllowance = calculateDearnessAllowance(basicSalary);
        double specialAllowance = calculateSpecialAllowance(basicSalary);
        System.out.println(basicSalary + " -" + dearnessAllowance + " - " + specialAllowance + " -" + grossSalary);
    }

    public static double calculateDearnessAllowance(int basicSalary) {
        double dearnessAllowance = 0;
        if (basicSalary <= 10000)
            dearnessAllowance = basicSalary * (15.0 / 100);
        if (basicSalary >= 10001 && basicSalary <= 20000)
            dearnessAllowance = basicSalary * (20.0 / 100);
        if (basicSalary >= 20001 && basicSalary <= 30000)
            dearnessAllowance = basicSalary * (25.0 / 100);
        if (basicSalary >= 30001)
            dearnessAllowance = basicSalary * (30.0 / 100);
        return dearnessAllowance;

    }

    public static double calculateSpecialAllowance(int basicSalary) {
        double specialAllowance = 0;
        if (basicSalary <= 10000)
            specialAllowance = basicSalary * (5.0 / 100);
        if (basicSalary >= 10001 && basicSalary <= 20000)
            specialAllowance = basicSalary * (8.0 / 100);
        if (basicSalary >= 20001 && basicSalary <= 30000)
            specialAllowance = basicSalary * (10.0 / 100);
        if (basicSalary >= 30001)
            specialAllowance = basicSalary * (12.0 / 100);
        return specialAllowance;

    }

    public static double calculateGrossSalary(int basicSalary) {
        return basicSalary + calculateDearnessAllowance(basicSalary) + calculateSpecialAllowance(basicSalary);
    }


    /*
    public static double calculateGrossSalary2(int basicSalary) {
        double grossSalary = 0;
        if (basicSalary <= 10000)
            grossSalary = basicSalary + basicSalary * (15.0 / 100) + basicSalary * (5.0 / 100);
        if (basicSalary >= 10001 && basicSalary <= 20000)
            grossSalary = basicSalary + basicSalary * (20.0 / 100) + basicSalary * (8.0 / 100);
        if (basicSalary >= 20001 && basicSalary <= 30000)
            grossSalary = basicSalary + basicSalary * (25.0 / 100) + basicSalary * (10.0 / 100);
        if (basicSalary >= 30001)
            grossSalary = basicSalary + basicSalary * (30.0 / 100) + basicSalary * (12.0 / 100);
        return grossSalary;
    }

     */
}
