package com.khraw;

import java.util.*;

public class Project6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet");
        String alphabet = sc.nextLine();
        double area = 0.0;
        switch (alphabet) {
            case "c":
                System.out.println("Circle");
                area = calculateAreaOfCircle();
                System.out.println("Area of Circle = " + area);
                break;

            case "r":
                System.out.println("Rectangle");
                area = calculateAreaOfRectangle();
                System.out.println("Area of Rectangle = " + area);
                break;

            case "s":
                System.out.println("Square");
                area = calculateAreaOfSquare();
                System.out.println("Area of Square = " + area);
                break;
            default:
                System.out.println(alphabet + " is not a valid option");
        }

    }

    private static double calculateAreaOfSquare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side");
        int side = sc.nextInt();
        double area = side * side;
        return area;
    }

    private static double calculateAreaOfRectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int length = sc.nextInt();
        System.out.println("Enter the breadth");
        int breadth = sc.nextInt();
        double area = length * breadth;
        return area;
    }

    public static double calculateAreaOfCircle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius = sc.nextInt();
        double area = (22.0/7) * radius * radius;
        return area;

    }
}