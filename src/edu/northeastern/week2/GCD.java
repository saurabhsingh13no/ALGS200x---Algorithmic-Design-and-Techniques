package edu.northeastern.week2;

import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long first  = scan.nextLong();
        long second = scan.nextLong();

        if (first<second) {
            System.out.println(computeGCD(second, first));
        }
        else {
            System.out.println(computeGCD(first, second));
        }


    }

    /**
     * Function that computes GCD using EuclideanGCD algorithm.
     * Approach utilized here : if a and b are two given numbers, then:
     *                          a = d + bq,
     *                          where d is the remainder and q is some quotient. Needless to say d may be zero
     *                          and q can be 1 or more.
     *                          Idea here is GCD(a,b) is equal to GCD(a', b) where a' is the number that divides
     *                          both a and b.
     * @param first : Long.
     * @param second : Long
     * @return : Long. GCD of first and second.
     */
    private static long computeGCD(long first, long second) {

        if (second == 0) {
            return first;
        }

        else {
//            System.out.println(first%second);
            return computeGCD(second, (long)first%second);
        }

    }
}
