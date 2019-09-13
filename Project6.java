package com.khraw;

import java.util.*;

public class Project6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c, s, l, b;
        System.out.println("Enter an alphabet");
        c = sc.nextLine();
        switch (c) {
            case "c":
                System.out.println("circle");
                double area = calculateAreaOfCircle();
                System.out.println("Area of circle = " + area);
                break;

            case "r":
                System.out.println("rectangle");
                break;

            case "s":
                System.out.println("square");
                break;



        }

    }
    public static double calculateAreaOfCircle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius = sc.nextInt();
        double area = (22.0/7) * radius * radius;
        return area;

    }
}