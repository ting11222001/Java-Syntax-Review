enum Level {
  LOW,
  MEDIUM,
  HIGH
}

public class SwitchLevel {
  public static void main(String[] args) {
    Level myVar = Level.MEDIUM;

    switch (myVar) {
      case LOW:
        System.out.println("Low Level");
        break;
      case MEDIUM:
        System.out.println("Medium Level"); // Medium Level
        break;
      case HIGH:
        System.out.println("High Level");
        break;
    }

    // Also try to loop throught the enum
    for (Level level : Level.values()) {
      System.out.println(level); // LOW MEDIUM HIGH
    }
  }
}
