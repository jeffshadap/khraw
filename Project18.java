package com.khraw;

public class Project18 {
    public static void main(String[] args) {
        boolean x = checkIfTwinPrimes(11,13);
        System.out.println(x);
    }

    public static boolean checkIfTwinPrimes(int number1, int number2) {
        if (checkIfPrimeNumber(number1) && checkIfPrimeNumber(number2)) {
            if (Math.abs(number1 - number2) == 2) return true;
            return false;
        }
        return false;
    }

    public static boolean checkIfPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if(number % i == 0) return  false;
        }

        return true;
    }
}
