import java.util.*;

public class ValidAnagram {
  public boolean isAnagram(String s, String t) {
    // check if the length of both strings are the same
    if (s.length() != t.length()) {
      return false;
    }

    // HashSet for s and t each
    // loop through s and check if t contains the same char
    HashSet<Character> sSet = new HashSet<Character>();
    HashSet<Character> tSet = new HashSet<Character>();
    char[] sArray = s.toCharArray(); // ['r', 'a', 't']
    char[] tArray = t.toCharArray(); // ['c', 'a', 'r']

    for (char c : sArray) {
      sSet.add(c);
    }

    for (char c : tArray) {
      tSet.add(c);
    }

    for (char c : sSet) {
      if (!tSet.contains(c)) {
        return false;
      }
    }

    for (char c : tSet) {
      if (!sSet.contains(c)) {
        return false;
      }
    }

    return true;
  }
}