package edu.northeastern.week2;

import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();

        System.out.println(lcm(a,b));
    }

    public static long lcm(long a, long b) {

        long gcd = computeGCD(a, b);
        return (a*b)/gcd;
    }

    public static long computeGCD(long a, long b) {
        if (b==0) {
            return a;
        }
        else {
            return computeGCD(b, a%b);
        }
    }
}
