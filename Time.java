import java.time.LocalDate; // import the LocalDate class
import java.time.LocalTime; // import the LocalTime class
import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Time {
  public static void main(String[] args) {
    LocalDate myObj = LocalDate.now();
    System.out.println(myObj); // 2024-04-21

    LocalTime myObj2 = LocalTime.now();
    System.out.println(myObj2); // 21:37:42.974818700

    LocalDateTime myObj3 = LocalDateTime.now();
    System.out.println(myObj3); // 2024-04-21T21:38:26.269456500

    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formattedDate = myObj3.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate); // After formatting: 21-04-2024 21:42:03
  }
}
