package edu.northeastern.week2;

import java.util.Scanner;

public class FibonacciSumLastDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(getFibonacciSumLastDigit(n));
    }

    private static long getFibonacciSumLastDigit(long n) {

        long lastDigit=0;

        if (n==0) {
            return 0;
        }

        if (n==1) {
            return 1;
        }

        long first =0;
        long second = 1;

        //Pisano period for 10 is 60
        n = n%60;

        for (int i=1;i<n+2;i++) {
            lastDigit = (first+second)%10;
            first = second;
            second = lastDigit;
        }

        // Actual last digit differs by 1 from division by 10;
        if (lastDigit==0) {return 9;}

        return lastDigit-1;
    }
}
