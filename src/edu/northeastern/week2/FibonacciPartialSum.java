package edu.northeastern.week2;

//Task.Given two non-negative integers m and n, where m<=n, find the last digit of the sum F(m) +F(m+1)+···+F(n).

import java.util.Scanner;

public class FibonacciPartialSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = scanner.nextLong();
        System.out.println(getFibonacciPartialSum(m,n));
    }

    private static long getFibonacciPartialSum(long m, long n) {
        long lastDigit = 0;
//        long pisanoPeriodForM = getPisanoPeriod(m);
//        long pisanoPeriodForN = getPisanoPeriod(n);

        long fibonacciSumLastDigitM = getFibonacciSumLastDigit(m-1);
        long fibonacciSumLastDigitN = getFibonacciSumLastDigit(n);


        return (10+fibonacciSumLastDigitN-fibonacciSumLastDigitM)%10;
    }

    private static long getPisanoPeriod(long k) {
        long pisanoPeriod = 1;

        long first = 0;
        long second =1;
        long remainder = 0;

        for(long i=0;i<10*k;i++) {
            remainder = (first+second)%k;
            first = second;
            second = remainder;
            pisanoPeriod += 1;

            if (first == 1 && second == 0) {break;}
        }

        return pisanoPeriod;
    }

    private static long getFibonacciSumLastDigit(long n) {

        long lastDigit=0;

        if (n<=0) {
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
