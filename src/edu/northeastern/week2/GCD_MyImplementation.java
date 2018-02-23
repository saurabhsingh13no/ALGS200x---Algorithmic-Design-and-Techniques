package edu.northeastern.week2;

import java.util.Scanner;

public class GCD_MyImplementation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long first = scan.nextInt();
        long second = scan.nextInt();

        System.out.println(computeGCD(first, second));
    }

    private static long computeGCD(long first, long second) {

        long result = 1;

        long smaller;
        if (first>second) {smaller = second;}
        else {smaller = first;}

        for (long i=smaller;i>1;i--) {
            if (first%i==0 && second%i==0){
                return i;
            }
        }

        return result;

    }
}
