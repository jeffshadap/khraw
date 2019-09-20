package com.khraw.jeff;

import java.util.ArrayList;
import java.util.List;

public class Scratch {
    public static void main(String[] args) {

        System.out.println(removeZeros(1004001));
        System.out.println(factors2(24));
        System.out.println(convertToBinary(14));

    }

    private static int removeZeros(int number) {
        String s = "";
        while (number > 0) {
            int rem = number % 10;
            if (rem != 0) {
//                System.out.println(rem);
                s = rem + s;
            }
            number = number / 10;
        }
        return Integer.parseInt(s);
    }

    private static String factors(int number) {
        for (int i = 1; i <= 24; ++i) {
            if (number % i == 0) {
                System.out.print(i);
                System.out.print(",");
            }
        }
        return "";
    }
    private static List<Integer> factors2(int number) {
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

    public static String convertToBinary(int number) {
        String s = "";
        while (number > 0) {
            int rem = number % 2;
            s = rem + s;
            number = number / 2;
        }
        return s;
    }
}
