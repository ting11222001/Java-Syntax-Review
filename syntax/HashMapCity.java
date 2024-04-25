package syntax;

import java.util.*;

public class HashMapCity {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add Items
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");

    System.out.println(capitalCities); // {USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}

    // Access an Item
    System.out.println(capitalCities.get("England")); // London

    // Remove an Item
    capitalCities.remove("England");
    System.out.println(capitalCities); // {USA=Washington DC, Norway=Oslo, Germany=Berlin}

    // Remove all items
    capitalCities.clear();
    System.out.println(capitalCities); // {}

    // HashMap Size
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities.size()); // 4

    // Loop Through a HashMap
    // Print keys
    for (String i : capitalCities.keySet()) {
      System.out.println(i); // USA Norway England Germany
    }

    // Print values
    for (String i : capitalCities.values()) {
      System.out.println(i); // Washington DC Oslo London Berlin
    }

    // Print keys and values
    for (String i : capitalCities.keySet()) {
      System.out.println("key: " + i + " value: " + capitalCities.get(i));
      /*
       * key: USA value: Washington DC
       * key: Norway value: Oslo
       * key: England value: London
       * key: Germany value: Berlin
       */
    }

    /*
     * Other Types
     * Keys and values in a HashMap are actually objects. In the examples above, we
     * used objects of type "String". Remember that a String in Java is an object
     * (not a primitive type). To use other types, such as int, you must specify an
     * equivalent wrapper class: Integer. For other primitive types, use: Boolean
     * for boolean, Character for char, Double for double, etc:
     */
    HashMap<String, Integer> people = new HashMap<String, Integer>();
    people.put("John", 32);
    people.put("Jane", 30);
    people.put("James", 22);

    for (String i : people.keySet()) {
      System.out.println("key: " + i + " value: " + people.get(i));
      /*
       * key: James value: 22
       * key: John value: 32
       * key: Jane value: 30
       */
    }
  }
}
