/*
 * A HashSet is a collection of items where every item is unique, and it is found in the java.util package:
 */

import java.util.*;

public class HashSetCar {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars); // [Volvo, Mazda, Ford, BMW]

    // Check If an Item Exists
    System.out.println(cars.contains("Mazda")); // true

    // Remove an Item
    cars.remove("Volvo");
    System.out.println(cars); // [Mazda, Ford, BMW]

    // HashSet Size
    System.out.println(cars.size()); // 3

    // Loop Through a HashSet (for-each)
    for (String i : cars) {
      System.out.println(i); // Mazda Ford BMW
    }

    // Remove all items
    cars.clear();
    System.out.println(cars); // []

    /*
     * Other Types
     * Items in an HashSet are actually objects. In the examples above, we created
     * items (objects) of type "String". Remember that a String in Java is an object
     * (not a primitive type). To use other types, such as int, you must specify an
     * equivalent wrapper class: Integer. For other primitive types, use: Boolean
     * for boolean, Character for char, Double for double, etc:
     */
    // Create a HashSet object called numbers
    HashSet<Integer> numbers = new HashSet<Integer>();
    // Add values to the set
    numbers.add(4);
    numbers.add(7);
    numbers.add(8);
    // Show which numbers between 1 and 10 are in the set
    for (int i = 0; i <= 10; i++) {
      if (numbers.contains(i)) {
        System.out.println(i + " was found in the set.");
      } else {
        System.out.println(i + " was not found in the set.");
      }
    }
    /*
     * 0 was not found in the set.
     * 1 was not found in the set.
     * 2 was not found in the set.
     * 3 was not found in the set.
     * 4 was found in the set.
     * 5 was not found in the set.
     * 6 was not found in the set.
     * 7 was found in the set.
     * 8 was found in the set.
     * 9 was not found in the set.
     * 10 was not found in the set.
     */
  }
}
