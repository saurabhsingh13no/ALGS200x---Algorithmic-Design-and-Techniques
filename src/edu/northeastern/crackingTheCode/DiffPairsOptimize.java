import java.util.*;
class DiffPairsOptimize {

  public static void main(String[] args) {

    if ('a'>'A') {
      System.out.println("a > A");
    }
    else {
      System.out.println("A > a");
    }
  
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
    ArrayList<Tuple> res = new ArrayList<Tuple>();
    Map<Integer, Integer> m = new HashMap<Integer, Integer>();
    for (int i=0;i<a.length;i++) {
      if (m.containsKey(a[i]-k)) {
        res.add(new Tuple(a[i], a[i]-k));
      }
      if (m.containsKey(a[i]+k)) {
        res.add(new Tuple(a[i]+k, a[i]));
      }

      m.put(a[i],i);
    }

    return res;
  }

}
