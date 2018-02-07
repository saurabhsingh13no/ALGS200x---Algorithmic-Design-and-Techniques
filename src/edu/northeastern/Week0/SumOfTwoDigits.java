// Problem to add 2 integers. Week0 first assignment

package edu.northeastern.Week0;
import java.util.Scanner;

public class SumOfTwoDigits {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 integers : ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Sum of two numbers : "+(a+b));
    }
}
