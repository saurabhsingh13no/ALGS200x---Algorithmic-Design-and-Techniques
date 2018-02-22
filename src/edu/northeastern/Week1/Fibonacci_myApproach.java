package edu.northeastern.Week1;

import java.util.Scanner;

public class Fibonacci_myApproach {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(computeFibonacci(n));
    }

    /**
     * Function to compute the fibonacci upto the given number
     * @param n : Integer. The value upto which the fibonacci is required
     * @return : Long. The fibonacci number computed.
     */
    private static long computeFibonacci(int n) {
        long result=0;

        if (n<=0) {
            return 0;
        }

        if (n<=2) {
            return 1;
        }

        long i=1, j=1;
        for (int k=2;k<n;k++) {
            result = i+j;
            i=j;
            j=result;
        }

        return result;
    }
}