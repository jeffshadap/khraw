package com.khraw.jeff;

import java.util.Scanner;

public class Project12 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generateTree(n);
    }

    private static void generateTree(int n) {
        String blank = " ";
        String symbol = "#";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(blank);
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(symbol);
                System.out.print(blank);
            }
            System.out.println();
        }
    }
}
