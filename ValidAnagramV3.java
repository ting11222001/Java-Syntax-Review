import java.util.*;

/* This solution passed all the test cases:
 * test cases:
 * s = "anagram"  t = "nagaram"
 * s = "rat"   t = "car"
 * s = "a"   t = "ab"
 * s = "aa"   t = "a"
 * s = "aacc"   t = "ccac"
 * s = "aabbbb"   t = "aaaabb" 
 */

public class ValidAnagramV3 {
  public boolean isAnagram(String s, String t) {

    char[] sArray = s.toCharArray(); // ['a', 'a', 'c', 'c']
    char[] tArray = t.toCharArray(); // ['c', 'c', 'a', 'c']

    // Must sort them first before comparing
    Arrays.sort(sArray); // O(nlogn)
    Arrays.sort(tArray);

    if (Arrays.equals(sArray, tArray)) {
      return true;
    }

    return false;
  }
}
