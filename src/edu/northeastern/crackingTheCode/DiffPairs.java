//package edu.northeastern.crackingTheCode;
import java.util.*;

class DiffPairs {

  DiffPairs() {

  }

  public static void main(String[] args) {

      System.out.println("Enter number of array elements : ");
      Scanner scan = new Scanner(System.in);

      int n = scan.nextInt();
      int a[] = new int[n];
      System.out.println("Enter the array elements : ");
      for (int i=0;i<n;i++) {
        a[i] = scan.nextInt();
      }

      System.out.println("Enter the k valus : ");
      int k = scan.nextInt();
      ArrayList<Tuple> l = getListPairs(a, k);
      for (Tuple t:l){
          System.out.println("("+t.a+", "+t.b+")");
      }

  }

  public static ArrayList<Tuple> getListPairs(int[] a, int k) {
    ArrayList<Tuple> response = new ArrayList<Tuple>();
    for (int i=0;i<a.length;i++) {
      for (int j=0;j<a.length;j++) {
        if (a[i] - a[j] == k) {
          response.add(new Tuple(a[i],a[j]));
        }
      }
    }

    return response;

  }

}
