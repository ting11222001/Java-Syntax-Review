package syntax;
// The ArrayList class is a resizable array, which can be found in the java.util package.

import java.util.*;

public class ArrayListCar {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();

    // Add Items
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");

    System.out.println(cars); // [Volvo, BMW, Ford]

    // Access an Item
    System.out.println(cars.get(2)); // Ford

    // Change an Item
    cars.set(0, "Opel");
    System.out.println(cars); // [Opel, BMW, Ford]

    // Remove an Item
    cars.remove(0);
    System.out.println(cars); // [BMW, Ford]

    // Remove all the elements in the ArrayList
    cars.clear();
    System.out.println(cars); // []

    // ArrayList Size
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    System.out.println(cars.size()); // 3

    // Loop Through an ArrayList
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i)); // Volvo BMW Ford
    }

    for (String j : cars) {
      System.out.println(j); // Volvo BMW Ford
    }

    /*
     * Other Types
     * Elements in an ArrayList are actually objects. In the examples above, we
     * created elements (objects) of type "String". To use other types, such as int,
     * you must specify an equivalent wrapper class: Integer. For other primitive
     * types, use: Boolean for boolean, Character for char, Double for double, etc:
     */

    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
    for (int j : myNumbers) {
      System.out.println(j); // 10 15 20 25
    }

    /*
     * Sort an ArrayList
     * Another useful class in the java.util package is the Collections class, which
     * include the sort() method for sorting lists alphabetically or numerically:
     */
    Collections.sort(cars);
    for (String j : cars) {
      System.out.println(j); // BMW Ford Volvo
    }

    ArrayList<Integer> myNumbers2 = new ArrayList<Integer>();
    myNumbers2.add(1);
    myNumbers2.add(15);
    myNumbers2.add(2);
    myNumbers2.add(25);
    Collections.sort(myNumbers2);
    for (int j : myNumbers2) {
      System.out.println(j); // 1 2 15 25
    }
  }
}
