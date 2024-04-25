/*
 * https://www.youtube.com/watch?v=Q485CWk_QWk&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=34&ab_channel=DineshVaryani
 */

public class StringIsPalindrome {

  public static boolean isPalindrome(String word) {
    char[] charArray = word.toCharArray();
    int start = 0; // t
    int end = word.length() - 1; // t

    while (start < end) { // start: 1, end: 2
      if (charArray[start] != charArray[end]) { // h vs a
        return false;
      }
      start++;
      end--;
    }

    return true;
  }

  public static void main(String[] args) {
    String input = "that";

    System.out.println("Result: " + isPalindrome(input));
  }
}
