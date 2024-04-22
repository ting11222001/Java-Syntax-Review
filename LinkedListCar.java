import java.util.*;

public class LinkedListCar {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();

    // Add Items
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");

    System.out.println(cars); // [Volvo, BMW, Ford]
  }
}

/*
 * Use an ArrayList for storing and accessing data, and LinkedList to manipulate
 * data:
 * addFirst()
 * addLast()
 * removeFirst()
 * removeLast()
 * getFirst()
 * getLast()
 */
