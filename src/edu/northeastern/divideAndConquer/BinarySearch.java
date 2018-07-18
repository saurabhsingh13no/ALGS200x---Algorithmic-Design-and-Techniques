import java.util.Scanner;
class BinarySearch {
  public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);

    System.out.println("Enter number of elements : ");
    int n = scan.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter array elements seperated by space : \n");
    for(int i=0;i<n;i++) {
      arr[i] = scan.nextInt();
    }
    System.out.println("Enter element to be searched for : ");
    int ele = scan.nextInt();
    System.out.println(bsearch(arr, 0, n, ele));
  }

  public static int bsearch(int[] arr, int low, int high, int ele) {
    if (low>=high) {
      return -1;
    }
    int mid = low + (high-low)/2;
    // System.out.println(mid+" "+arr[1]);
    if (arr[mid]==ele) {
      return mid;
    }
    if (ele>arr[mid])
      return bsearch(arr,mid+1, high, ele);
    else
      return bsearch(arr, low, mid-1, ele);
  }
}
