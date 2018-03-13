package edu.northeastern.week2;

import java.util.Scanner;

public class GCD_slow {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long first = scan.nextInt();
        long second = scan.nextInt();

        long startTime = System.nanoTime();
        System.out.println(computeGCD(first, second));
        long endTime = System.nanoTime();

        System.out.println("Time taken : "+ (endTime-startTime)/1000000000.0 +" sec");
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
