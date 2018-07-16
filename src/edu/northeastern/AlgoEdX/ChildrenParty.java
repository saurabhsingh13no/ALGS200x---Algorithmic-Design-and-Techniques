import java.util.*;
class ChildrenPart {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] a = new int[n];
    for (int i=0;i<n;i++) {
      a[i] = scan.nextInt();
    }

    System.out.println(getSegments(a));
  }

  public static List<Tuple> getSegments(int[] a) {
    List<Tuple> seg = new ArrayList<Tuple>();
    int left = 0;
    while (left<a.length) {
      Tuple t = new Tuple(a[left], a[left]+2);
      seg.add(t);
      left += 1;
      while (left<a.length && a[left]<=t.b) {
        left += 1;
      }
    }

    return seg;
  }

}
