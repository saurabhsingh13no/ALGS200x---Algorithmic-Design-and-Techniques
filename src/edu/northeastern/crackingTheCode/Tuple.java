//package edu.northeastern.crackingTheCode;
import java.util.*;
class Tuple{
  int a;
  int b;

  Tuple(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public Set<Integer> getPairs() {
    Set<Integer> s = new HashSet<Integer>();
    s.add(this.a);
    s.add(this.b);

    return s;
  }

}
