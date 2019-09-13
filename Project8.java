package com.khraw;
import java.nio.channels.AcceptPendingException;
import java.util.*;
public class Project8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Enter a no");
        a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Natural log");
                break;


            case 2:
                System.out.println("Absolute value");
                break;

            case 3:
                System.out.println("Sq root ");
                break;

            case 4:
                System.out.println("Random number between 1 and 0");
                break;

            default:
                System.out.println("What?????");
                break;
        }
    }
}