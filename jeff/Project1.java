package com.khraw.jeff;

import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {

        int days = readInt("enter no days");
        double rate = calculateRate(days);
        double fine = rate * days;
        System.out.println(rate);
        System.out.println("The fine is " + fine);
    }

    public static int readInt(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextInt();
    }

    public static double calculateRate(int days) {
        double rate = 0.0;
        if (days >= 1 && days <= 5)
            rate = 0.40;
        if (days >= 6 && days <= 10)
            rate = 0.65;
        if (days > 10)
            rate = 0.80;

        return rate;
    }

}

