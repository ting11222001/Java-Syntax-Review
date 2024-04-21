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
  }
}
