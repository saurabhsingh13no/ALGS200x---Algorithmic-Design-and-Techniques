package edu.northeastern.week0;

import java.util.Scanner;

/**
 * Class to determine the maxiumum product of 2 unique numbers from the given set of numbers
 */
public class MaxPairWiseProductFast {

    public static void main(String[] args) {

        //Creating a scanner object to handler user input
        Scanner scan = new Scanner(System.in);

        //Enter the size of numbers:
        int n = scan.nextInt();
        System.out.println(findMaxProduct(readNumbers(n, scan), n));
    }

    /**
     * Method to read numbers from the system input
     * @param n : Length of numbers
     * @param scan : Scanner object
     * @return : Integer array of numbers
     */
    public static int[] readNumbers(int n, Scanner scan) {

        int[] numbers = new int[n];
        for(int i=0;i<n;i++) {
            numbers[i]=scan.nextInt();
        }
        return numbers;
    }

    /**
     * Method to compute the maximum product from the set of numbers
     * @param numbers : Array of integers
     * @return : Integer
     */
    public static int findMaxProduct(int[] numbers, int n) {
        int index1 = 0;

        // Finding max integer among given set of numbers
        for (int i=1;i<n;i++){
            if (numbers[i]>numbers[index1]) {
                index1 = i;
            }
        }

        // Finding max Integer other than above one from the given set of Integers
        int index2;
        if (index1==0) {
            index2 = 1;
        }
        else {
            index2 = 0;
        }

        for (int i=1; i<n;i++) {
            if (i!=index1 && numbers[i]>numbers[index2]) {
                index2 = i;
            }
        }
        return numbers[index1] * numbers[index2];
    }
}
