package edu.northeastern.week2;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciLastDigit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(computeFibonacci(n).mod(new BigInteger("10")));
    }

    /**
     * Function to compute the fibonacci upto the given number
     * @param n : Integer. The value upto which the fibonacci is required
     * @return : Long. The fibonacci number computed.
     */
    private static BigInteger computeFibonacci(int n) {
        BigInteger result= new BigInteger("0");

        if (n<=0) {
            return BigInteger.valueOf(0);
        }

        if (n<=2) {
            return BigInteger.valueOf(1);
        }

        BigInteger i = new BigInteger("1");
        BigInteger j = new BigInteger("1");
        for (int k=2;k<n;k++) {
            result = i.add(j);
            i=j;
            j=result;
        }

        return result;
    }
}