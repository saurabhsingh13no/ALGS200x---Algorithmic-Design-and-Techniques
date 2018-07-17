import java.util.Scanner;

class MaxPrizes {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();

    System.out.println(findMaxPrizes(n));
  }

  public static long findMaxPrizes(long n) {

    long d = (long)Math.sqrt(1 + 8*n);
    return (d-1)/2;

  }

}
