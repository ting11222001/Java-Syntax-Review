package syntax;

public class StringMethod {
  public static void main(String[] args) {
    String myStr = "Hello";
    System.out.println(myStr.charAt(0)); // H
    System.out.println(myStr.contains("el")); // true
    System.out.println(myStr.endsWith("lo")); // true

    String myStr2 = "Hello planet earth, you are a great planet.";
    System.out.println(myStr2.indexOf("planet")); // 6

    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println(txt.length()); // 26

    System.out.println(myStr.replace('l', 'p')); // Heppo

    // Split a string into an array of strings:
    String myStr3 = "Split a string by spaces, and also punctuation.";
    String regex = "[,\\.\\s]";
    String[] myArray = myStr3.split(regex);
    for (String s : myArray) {
      System.out.println(s);
    }
    /*
     * Split
     * a
     * string
     * by
     * spaces
     * 
     * and
     * also
     * punctuation
     */

    // Return a substring from a string:
    String myStr4 = "Hello, World!";
    System.out.println(myStr4.substring(7, 12)); // World (index 12 is excluded)
    System.out.println(myStr4.substring(7, 13)); // World!

    // Convert a string to a char array:
    String myStr5 = "Hello";
    char[] myArray2 = myStr5.toCharArray();
    System.out.println(myArray2); // Hello
    System.out.println(myArray2[0]); // H

    System.out.println(myStr5.toUpperCase()); // HELLO
    System.out.println(myStr5.toLowerCase()); // hello

    String myStr6 = "       Hello World!       ";
    System.out.println(myStr6.trim()); // Hello World!

    // Another useful method is the toString() method, which is used to convert
    // wrapper objects to strings.
    Integer myInt = 100;
    String myString = myInt.toString();
    System.out.println(myString.length()); // 3
  }
}
