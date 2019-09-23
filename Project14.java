package com.khraw;

import java.util.*;

public class Project14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n=?");
        int n = sc.nextInt();
        int sum = 0;
        int counter = 10;
        for (int i = 1; i <= n; ++i) {
            if (i % 2 == 1) {
                counter--;
                sum = sum + counter;
                System.out.print(counter + ",");
            } else {
                sum = sum + counter*11;
                System.out.print(counter * 11 + ",");
            }
        }
        System.out.println();
        System.out.print("sum is " + sum);

    }
}
