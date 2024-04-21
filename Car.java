class Vehicle {
  // protected: The code is accessible in the same package and subclasses
  protected String brand = "Ford";

  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  // private: The code is only accessible within the declared class
  private String modelName = "Mustang";

  public static void main(String[] args) {
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk(); // Tuut, tuut!

    // Display the value of the brand attribute (from the Vehicle class) and the
    // value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName); // Ford Mustang
  }

}
