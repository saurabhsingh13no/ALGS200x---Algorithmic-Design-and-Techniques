import java.util.*;
import java.io.*;

class SpecialIntegers {
  int n;

  SpecialIntegers(int n) {
    this.n = n;
  }

  public String toString() {
    return String.valueOf(this.n);
  }
}

// do this with lambda function
class SortByFirstDigit implements Comparator<SpecialIntegers> {

  @Override
  public int compare(SpecialIntegers s1 ,SpecialIntegers s2) {
    String first = String.valueOf(s1);
    String second = String.valueOf(s2);

    return -first.compareTo(second);
  }
}


class LargestNumberFromSetOfIntegers {
  public static void main(String[] args) throws Exception{
    String filepath = "3_6_largest_number.in";
    List<SpecialIntegers> li = readFile(filepath);
    System.out.println("Before sorting : "+li);
    Collections.sort(li, new SortByFirstDigit());
    System.out.println("\n\nAfter sorting : "+li);
    System.out.println(findLargestNumber(li));
  }

  public static List<SpecialIntegers> readFile(String filepath) throws Exception{
    List<SpecialIntegers> si = new ArrayList<>();
    File file = new File(filepath);
    BufferedReader bf = new BufferedReader(new FileReader(file));
    String st = bf.readLine();
    while ((st=bf.readLine())!=null) {
      String[] arr = st.split(" ");
      for (String ele : arr) {
        si.add(new SpecialIntegers(Integer.parseInt(ele)));
      }
    }
    return si;
  }

  public static long findLargestNumber(List<SpecialIntegers> li) {
    long n;
    String number = "";
    for (SpecialIntegers s : li) {
      number += String.valueOf(s.n);
    }
    n = Long.parseLong(number);
    return n;
  }
}
