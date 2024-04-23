package syntax;

import java.util.Scanner;

public class UserInput {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username, age, and salary: ");

    // String input
    String userName = myObj.nextLine();

    // Numerical input
    int age = myObj.nextInt();
    double salary = myObj.nextDouble();

    // Output input by user
    System.out.println("Username: " + userName);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}
