/**
 * Ques : Find the maximum product of two distinct numbers in a sequence of non-negative integers.
 * Solution: Below is the naive implementation for the solution
 */



package edu.northeastern.Week0;
import java.util.Scanner;

public class MaxPairWiseProductNaive {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int array[] = readNumbers(n, scan);
        int maxProduct = findMaxProduct(array, n);

        System.out.println("Max product of 2 distinct numbers : "+maxProduct);


    }

    public static int[] readNumbers(int n, Scanner scan) {

        int array[] =  new int[n];
        for (int i=0;i<n;i++) {
            array[i] = scan.nextInt();
        }

        return array;
    }

    public static int findMaxProduct(int[] array, int n) {
        int maxProduct = -1;
        for(int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (i!=j) {
                    maxProduct = Integer.max(maxProduct, array[i]*array[j]);
                }
            }
        }
        return maxProduct;
    }



}
