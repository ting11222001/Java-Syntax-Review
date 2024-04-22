// Why And When To Use Interfaces?
// Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces.

interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("This calls myMethod from FirstInterface");
  }

  public void myOtherMethod() {
    System.out.println("This calls myOtherMethod from SecondInterface");
  }
}

class InterfaceMultiple {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod(); // This calls myMethod from FirstInterface
    myObj.myOtherMethod(); // This calls myOtherMethod from SecondInterface
  }
}
