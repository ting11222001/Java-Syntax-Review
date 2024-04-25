package syntax;

// An enum is a special "class" that represents a group of constants.
// Enum inside a Class:
public class Level {
  enum SomeLevels {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) {
    SomeLevels myEnumMedium = SomeLevels.MEDIUM;
    System.out.println(myEnumMedium); // MEDIUM
  }
}
