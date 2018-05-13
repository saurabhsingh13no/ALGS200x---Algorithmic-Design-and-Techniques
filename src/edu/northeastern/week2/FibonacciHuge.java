package edu.northeastern.week2;

import java.util.Scanner;

public class FibonacciHuge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHuge(n,m));
    }

    private static long getFibonacciHuge(long n, long m) {
        long first = 0;
        long second =1;
        long counter = 1;

        // Computing Pisano period. Value is stored in 'counter'
        for (long i=0;i<=4*m;i++){
            long k = (first+second)%m;
            counter +=1 ;
            first = second;
            second = k;

            if (first == 1 && second ==0) {
                System.out.println("Pisano Period : "+counter);
                break;
            }
        }
        first = 0;
        second = 1;

        for (long i=0;i<n%counter;i++) {
            long k = (first+second)%m;
            first = second;
            second = k;
        }
        System.out.println("First :"+first+", Second : "+second);

        return first;
    }
}
