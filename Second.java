public class Second {
  public static void main(String[] args) {
    // Using Multiple Classes
    // Access an object from the OOP class and its attributes.
    OOP myObj = new OOP();
    System.out.println(myObj.h); // 5
    System.out.println(myObj.j); // 6

    // Using Multiple Classes
    // Access an object from the OOP class called car in another class.
    OOP myCar = new OOP();
    myCar.fullThrottle();
    myCar.speed(50);

    // Create an object of the Student class (which inherits attributes and
    // methods from AbstractMain)
    Student myStudent = new Student();

    // Student inherited from AbstractMain
    System.out.println("Name: " + myStudent.firstName);
    System.out.println("Age: " + myStudent.age);
    // Student its own attribute
    System.out.println("Graduation Year: " + myStudent.graduationYear);
    // Student abstract method inherited and created from AbstractMain
    myStudent.study();

    // Encapsulation
    Person myPerson1 = new Person();
    // Public name field
    System.out.println(myPerson1.publicName); // This is a public name.
    // Private name field
    myPerson1.setName("This is a new string for the private name field");
    System.out.println(myPerson1.getName()); // This is a new string for the private name field
  }
}
