import java.util.*;

public class ValidAnagramV2 {
  public boolean isAnagram(String s, String t) {
    // check if the length of both strings are the same
    if (s.length() != t.length()) {
      return false;
    }

    // HashMap for s and t each
    // loop through s and check if t contains the same char (key)
    // and check if t contains the same counts of the char (key)
    HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
    HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();
    char[] sArray = s.toCharArray(); // ['a', 'a', 'c', 'c']
    char[] tArray = t.toCharArray(); // ['c', 'c', 'a', 'c']

    for (char c : sArray) {
      if (!sMap.containsKey(c)) {
        sMap.put(c, 1); // sMap: {a=1} {c=1}
        continue;
      }
      sMap.put(c, sMap.get(c) + 1); // sMap: {a=2} {c=2}
    }

    for (char c : tArray) {
      if (!tMap.containsKey(c)) {
        tMap.put(c, 1); // tMap: {c=1} {a=1}
        continue;
      }
      tMap.put(c, tMap.get(c) + 1); // tMap: {c=2} -> {c=3} {a=1}
    }

    if (sMap.size() != tMap.size()) {
      return false;
    }

    for (char key : sMap.keySet()) {
      if (!tMap.containsKey(key)) {
        return false;
      }

      if (tMap.get(key) != sMap.get(key)) {
        return false;
      }
    }

    return true;
  }
}
