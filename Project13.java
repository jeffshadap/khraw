package com.khraw;

import java.util.*;

public class Project13 {
    public static void main(String[] args) {

        int number = readNumber();

        if (number == sumOfFactorialOfDigits(number)) {
            System.out.println("Special Number");
        } else {
            System.out.println("Not a Special Number");
        }
    }


    public static int sumOfFactorialOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum + calculateFactorial(digit);
            number = number / 10;
        }
        return sum;
    }

    public static int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int readNumber() {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        return i;
    }
}