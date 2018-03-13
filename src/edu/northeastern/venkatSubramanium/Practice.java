package edu.northeastern.venkatSubramanium;

import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {

        List<Integer> x = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

//        x.forEach(value -> System.out.println(value));

//        x.forEach(System.out::println);

        System.out.println(
        x.stream()
         .filter(e -> e%2==0)
         .count());

    }

}
