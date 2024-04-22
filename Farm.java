// Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.

// Polymorphism allows objects of different classes to be treated as objects of a common superclass. In this case, Animal is the superclass, and Pig and Dog are its subclasses.

class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

// Bird is a Subclass (inherit from AbstractAnimal)
class Bird extends AbstractAnimal {
  // The body of animalSound() is provided here
  public void animalSound() {
    System.out.println("The bird says: chirp cheep");
  }
}

// Cat "implements" the Animal interface
class Cat implements InterfaceAnimal {
  // The body of animalSound() is provided here
  public void animalSound() {
    System.out.println("The cat says: meow meow");
  }

  public void sleep() {
    System.out.println("Zzz Zzz");
  }
}

public class Farm {
  public static void main(String[] args) {
    // Polymorphism:
    // Create a Animal object
    Animal myAnimal = new Animal();
    // Create a Pig object
    Animal myPig = new Pig();
    // Create a Dog object
    Animal myDog = new Dog();

    myAnimal.animalSound(); // The animal makes a sound
    myPig.animalSound(); // The pig says: wee wee
    myDog.animalSound(); // The dog says: bow wow

    // Create a Bird object
    Bird myBird = new Bird();
    myBird.animalSound(); // The bird says: chirp cheep
    myBird.sleep(); // Zzz

    // Create a Cat object
    Cat myCat = new Cat();
    myCat.animalSound(); // The cat says: meow meow
    myCat.sleep(); // Zzz Zzz
  }
}
