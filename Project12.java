package com.khraw;
import java.util.*;
public class Project12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int i, j;
        String blank = " ";
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(blank);
            }

            for (j = 1; j <= i; j++) {
                System.out.print("#");
                System.out.print(blank);
            }
            System.out.println(" ");

        }

    }
}
