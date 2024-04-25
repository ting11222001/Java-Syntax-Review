package syntax;

public class Methods {
  // static means that the method belongs to the Main class and not an object of
  // the Main class.
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  // Parameters
  static void myMethodAddParameter(String firstName) {
    System.out.println(firstName + " " + "Doe");
  }

  // Return values
  static int myMethodAdd5(int num) {
    return num + 5;
  }

  static int myMethodAddTwoNum(int x, int y) {
    return x + y;
  }

  // Overloading
  // With method overloading, multiple methods can have the same name with
  // different parameters:
  static int plusMethod(int x, int y) {
    return x + y;
  }

  static double plusMethod(double x, double y) {
    return x + y;
  }

  public static void main(String[] args) {
    // Call the methods
    myMethod();

    myMethodAddParameter("Tiffany");
    myMethodAddParameter("Jane");
    myMethodAddParameter("John");

    System.out.println(myMethodAdd5(3)); // 8

    int p = myMethodAddTwoNum(2, 3);
    System.out.println(p); // 5

    int result1 = plusMethod(8, 5);
    double result2 = plusMethod(8.3, 5.3);
    System.out.println(result1); // 13
    System.out.println(result2); // 13.600000000000001
  }
}
