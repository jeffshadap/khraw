package com.khraw.jeff;

import java.util.Scanner;

public class Project6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet");
        String alphabet = sc.nextLine();
        String figure = "";
        double area = 0.0;
        switch (alphabet) {
            case "c":
                figure = "Circle";
                area = calculateAreaOfCircle();
                break;

            case "r":
                figure = "Rectangle";
                area = calculateAreaOfRectangle();
                break;

            case "s":
                figure = "Square";
                area = calculateAreaOfSquare();
                break;
            default:
                System.out.println(alphabet + " is not a valid option");
                System.exit(1);
        }
        System.out.println("Area of " + figure + "=" + area);

    }

    public static int readInt(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextInt();
    }

    private static double calculateAreaOfSquare() {
        System.out.println("Square");
        int side = readInt("Enter the side");
        double area = side * side;
        return area;
    }

    private static double calculateAreaOfRectangle() {
        System.out.println("Rectangle");
        int length = readInt("Enter the length");
        int breadth = readInt("Enter the breadth");
        double area = length * breadth;
        return area;
    }

    public static double calculateAreaOfCircle(){
        System.out.println("Circle");
        int radius = readInt("Enter the radius");
        double area = (22.0/7) * radius * radius;
        return area;
    }
}