package syntax;

import java.util.*;

public class ArraysMethod {
  public static void main(String[] args) {
    String[] cars = { "Volvo", "BMW", "Tesla" };
    String[] cars2 = { "Volvo", "BMW", "Tesla" };

    System.out.println(Arrays.equals(cars, cars2)); // true

    Arrays.sort(cars);
    for (String i : cars) {
      System.out.println(i); // BMW Tesla Volvo
    }

    int[] myNum = { 50, 10, 25, 1, 17, 99, 33 };
    Arrays.sort(myNum);
    for (int i : myNum) {
      System.out.println(i); // 1 10 17 25 33 50 99
    }

    System.out.println(myNum.length); // 7
  }
}
