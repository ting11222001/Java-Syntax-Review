public class OOP {
  // Attributes created for OOP class
  int h = 5;
  int j = 6;
  int x;

  // Car attributes
  int modelYear;
  String modelName;

  // Create a class constructor for the OOP class
  public OOP() {
    x = 50; // Set the initial value for the class attribute x
  }

  // Constructors can also take parameters
  public OOP(int y) {
    x = y; // Set the initial value for the class attribute x as y
  }

  public OOP(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  // Static Method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public Method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Car method: fullThrottle()
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Car method: speed()
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  public static void main(String[] args) {
    // Create an Object
    OOP myObj1 = new OOP();
    System.out.println(myObj1.h); // 5
    OOP myObj2 = new OOP();
    System.out.println(myObj2.h); // 5

    // Modify attribute values
    myObj2.j = 40;
    System.out.println(myObj2.j); // 40

    // Static vs. Public methods
    myStaticMethod(); // Static methods can be called without creating objects

    OOP myObj3 = new OOP();
    myObj3.myPublicMethod(); // Public methods must be called by creating objects

    // Access Methods With an Object
    // Create a car object and access its methods
    OOP myCar = new OOP();
    myCar.fullThrottle(); // The car is going as fast as it can!
    myCar.speed(50); // Max speed is: 50

    // Create an object of class OOP (This will call the constructor)
    OOP myObj4 = new OOP();
    System.out.println(myObj4.x); // 50

    // Create an object of class OOP (pass a parameter to the constructor)
    OOP myObj5 = new OOP(500);
    System.out.println(myObj5.x); // 500

    // Create an object of class OOP (pass multiple parameters to the constructor)
    OOP myCar2 = new OOP(1969, "Mustang");
    System.out.println(myCar2.modelYear + " " + myCar2.modelName); // 1969 Mustang
  }
}
