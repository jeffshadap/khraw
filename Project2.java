package com.khraw;

import java.util.*;

public class Project2 {
    public static void main(String args[]) {
        double n = calculateTax(800000);
        System.out.println(n);

    }

    public static double calculateTax(int salary) {
        Scanner sc = new Scanner(System.in);
        double tax = 0.0;
        if (salary >= 250000)
            tax = calculateTaxCategory1();
        if (salary >= 250001 && salary <= 500000)
            tax = calculateTaxCategory2(salary);
        if (salary >= 500001 && salary <= 1000000)
            tax = calculateTaxCategory3(salary);
        if (salary > 1000000)
            tax = calculateTaxCategory4(salary);

        return tax;
    }

    public static double calculateTaxCategory1() {
        return 0.0;
    }

    public static double calculateTaxCategory2(int salary) {
        int excess = salary - 250000;
        return excess * (10.0 / 100);
    }

    public static double calculateTaxCategory3(int salary) {
        int excess = salary - 500000;
        return 10000 + excess * (20.0 / 100);
    }

    public static double calculateTaxCategory4(int salary) {
        int excess = salary - 1000000;
        return 25000 + excess * (30.0 / 100);
    }
}

