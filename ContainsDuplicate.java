
/*
 * https://www.youtube.com/watch?v=3OamzN90kPg&ab_channel=NeetCode
 */
import java.util.*;

public class ContainsDuplicate {
  public static boolean containsDuplicate(int[] nums) {
    // hashmap<Integer, Integer>: num, counts
    // loop through array, update hashmap
    // loop through hashmap to find counts >= 2
    // return true/false

    HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();

    for (int i : nums) {
      if (!counts.containsKey(i)) {
        counts.put(i, 1);
        continue;
      }
      int count = counts.get(i);
      counts.put(i, count + 1);
    }

    for (int j : counts.values()) {
      if (j >= 2) {
        return true;
      }
    }

    return false;
  }

  public static boolean containsDuplicate2(int[] nums) {
    // add each num into a hashset
    // ask hashset if it contains num

    HashSet<Integer> counts = new HashSet<Integer>();

    for (int i : nums) {
      if (counts.contains(i)) {
        return true;
      }
      counts.add(i);
    }

    return false;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 1 };
    System.out.println("Result: " + containsDuplicate(nums));
    System.out.println("Result2: " + containsDuplicate2(nums));
  }
}
