import java.util.*;
import java.io.*;

class CollectingSignature {
  public static void main(String[] args) throws Exception {
    String filepath = "3_4_covering_segments.in";
    List<Tuple> t = readFile(filepath);
    System.out.println("In main after reading file "+t);

    Collections.sort(t, new SortByFirstElement());

    System.out.println("\n\nArrayList after sorting"+t);

    System.out.println(minPoints(t));
  }

  public static List<Tuple> readFile(String filepath) throws Exception {

    List<Tuple> lt = new ArrayList<>();

    File file = new File(filepath);

    BufferedReader bf = new BufferedReader(new FileReader(file));

    String st = bf.readLine();
    System.out.println(st);
    int n = Integer.parseInt(st);

    String[] arr;

    while ((st=bf.readLine())!= null) {
      arr = st.split(" ");
      Tuple t = new Tuple(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
      lt.add(t);
    }
    return lt;
  }

  public static int minPoints(List<Tuple> lt) {
    int min_points = 0;
    int top =0;
    int right;

    System.out.println("Length of arrayList : "+lt.size());

    while(top<lt.size()-1) {
      right = lt.get(top).b;
      top++;
      while (right >= lt.get(top).a) {
        if (right>lt.get(top).b) {
          right = lt.get(top).b;
        }
        top++;
      }
      min_points++;
    }

    return (top == lt.size())? min_points:min_points+1;

  }

}

class SortByFirstElement implements Comparator<Tuple> {
  @Override
  public int compare(Tuple t1, Tuple t2) {
    return t1.a>t2.a?1:-1;
  }
}
