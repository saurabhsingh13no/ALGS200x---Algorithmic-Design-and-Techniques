// Problem to add 2 integers. Week0 first assignment

package edu.northeastern.week1;
import java.util.Scanner;

public class APlusB {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 integers : ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Sum of two numbers : "+(a+b));
    }
}
