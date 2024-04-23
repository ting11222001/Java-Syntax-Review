package syntax;

import java.io.*;
import java.util.*;

public class ReadFiles {
  public static void main(String[] args) {
    try {
      // Create a new file
      File myObj = new File("filename.txt");

      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists");
      }

      // Write to a file
      FileWriter myWriter = new FileWriter("filename.txt");
      myWriter.write("Files in Java might be tricky,");
      myWriter.write("but it is fun enough!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");

      // Read a file
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
        // Files in Java might be tricky,but it is fun enough!
      }
      myReader.close();

      // Get File Information
      if (myObj.exists()) {
        System.out.println("File name: " + myObj.getName());
        System.out.println("Absolute path: " + myObj.getAbsolutePath()); 
        // File name: filename.txt
        // Absolute path: C:\Users\user\Documents\Projects\Java-Syntax-Review\filename.txt
      } else {
        System.out.println("The file does not exist.");
      }
    } catch (Exception e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
