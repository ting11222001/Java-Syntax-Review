package syntax;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    System.out.println("I'm learning Java.");
    System.out.println("It's awesome!");

    // print on the same line
    System.out.print("This line");
    System.out.print(" will print on the same line.");
    System.out.println();

    // print out a number
    System.out.println(123);

    // perform mathematical calculations inside the println() method:
    System.out.println(1 + 2);

    // Declaring (Creating) Variables
    String name = "John";
    System.out.println(name);

    // declare a variable without assigning the value
    int myNum;
    myNum = 15;
    System.out.println(myNum);

    // assign a new value to an existing variable
    myNum = 20;
    System.out.println(myNum);

    // other types
    float myFloatNum = 5.999f;
    System.out.println(myFloatNum);

    char myChar = 'a';
    System.out.println(myChar);

    boolean myBoolean = true;
    System.out.println(myBoolean);

    // Display Variables
    String firstName = "John";
    String lastName = "Doe";
    System.out.println(firstName + " " + lastName);

    // Modulus: Returns the division remainder
    int x = 5;
    int y = 2;
    System.out.println(x % y); // 1

    // Increment
    ++x;
    System.out.println(x); // 6

    // assignment operators
    x %= 3;
    System.out.println(x); // 0

    // String length
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the text string is: " + txt.length()); // 26

    // String toLowerCase
    System.out.println(txt.toLowerCase());

    // Finding a Character in a String
    String find = "Please locate where 'locate' occurs!";
    System.out.println(find.indexOf("locate")); // 7

    // Math.max(x,y)
    System.out.println(Math.max(5, 10)); // 10

    // Math.abs(x)
    System.out.println(Math.abs(-4.7)); // 4.7

    // Random Number returns a random number between 0.0 (inclusive), and 1.0
    // (exclusive)
    System.out.println(Math.random()); // 0.6600660536102633

    // if only want a random number between 0 and 100 and cast it into int
    System.out.println((int) (Math.random() * 101));

    // Booleans and If ... Else
    int myAge = 25;
    int votingAge = 18;
    if (myAge >= votingAge) {
      System.out.println("Old enough to vote!");
    } else {
      System.out.println("Not old enough to vote!");
    }

    // Short Hand If...Else
    String result = (myAge >= votingAge) ? "Old enough to vote!" : "Not old enough to vote!";
    System.out.println(result);

    // switch
    int day = 5;
    switch (day) {
      case 1:
        System.out.println("Mon");
        break;
      case 2:
        System.out.println("Tue");
        break;
      case 3:
        System.out.println("Wed");
        break;
      case 4:
        System.out.println("Thu");
        break;
      default:
        System.out.println("Looking forward to the rest of the week!");
    }

    // while loop
    int i = 0;
    while (i < 3) {
      System.out.println(i);
      i++;
    }

    // do while loop
    int q = 0;
    do {
      System.out.println(q);
      q++;
    } while (q < 4);

    // for loop
    for (int t = 0; t < 5; t++) {
      System.out.println(t);
    }

    // Nested Loops
    for (int a = 1; a <= 2; a++) {
      System.out.println("Outer: " + a);

      for (int b = 1; b <= 3; b++) {
        System.out.println("Inner: " + b);
      }
    }

    // For-Each Loop:
    // which is used exclusively to loop through elements in an array
    // for (type variable : arrayname) { ... }
    String[] cars = { "Volvo", "BMW", "Ford" };
    for (String e : cars) {
      System.out.println(e);
    }

    // Break: used to jump out of a loop.
    for (int s = 0; s < 10; s++) {
      if (s == 4) {
        break;
      }
      System.out.println(s); // 0, 1, 2, 3
    }

    // Continue
    for (int v = 0; v < 10; v++) {
      if (v == 4) {
        continue;
      }
      System.out.println(v); // 0, 1, 2, 3, 5, 6, 7, 8, 9
    }

    // Break in While Loop
    int e = 0;
    while (e < 10) {
      System.out.println(e);
      e++;
      if (e == 4) {
        break; // 0, 1, 2, 3
      }
    }

    // Continue in While Loop
    int f = 0;
    while (f < 10) {
      System.out.println(f);
      f++;
      if (f == 4) {
        continue; // 0, 1, 2, 3, 5, 6, 7, 8, 9
      }
    }

    // Arrays
    String[] goodCars = { "Volvo", "BMW", "Ford", "Mazda" };
    System.out.println(goodCars[0]);

    int[] myNums = { 10, 20, 30, 40 };
    System.out.println(myNums[3]);

    // Array Length
    // To find out how many elements an array has, use the length property:
    System.out.println(goodCars.length); // 4

    // Loop Through an Array
    for (int d = 0; d < goodCars.length; d++) {
      System.out.println(goodCars[d]);
    }

    // Loop Through an Array with For-Each
    for (String goodCar : goodCars) {
      System.out.println(goodCar);
    }

    // Multidimensional Arrays
    int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
    System.out.println(myNumbers[1][2]); // 7

    // Loop Through a Multi-Dimensional Array
    // for loops:
    for (int row = 0; row < myNumbers.length; row++) {
      for (int col = 0; col < myNumbers[row].length; col++) {
        System.out.println(myNumbers[row][col]); // 1, 2, 3, 4, 5, 6, 7
      }
    }
    // for-each loops:
    for (int[] row : myNumbers) {
      for (int n : row) {
        System.out.println(n); // 1, 2, 3, 4, 5, 6, 7
      }
    }
  }
}