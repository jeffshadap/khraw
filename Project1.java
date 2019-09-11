package com.khraw;

import java.util.*;

public class Project1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no days");
        int days=sc.nextInt();
        double rate = calculateRate(days);
        double fine=rate*days;
        System.out.println(rate);
        System.out.println("the fine is " + fine);
    }

    public static double calculateRate(int days) {
        double rate =0.0;
        if (days >= 1 && days <= 5)
            rate = 0.40;
       if (days >=6 && days <= 10)
           rate = 0.65;
       if(days>10)
           rate=0.80;

        return rate;
    }

}

