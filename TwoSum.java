import java.util.*;

/*
 * Note that ArrayList<Integer> != int[] in java
 */

public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    // i = 0 -> 2
    // 9 - 2 = 7 -> search from i = 1 to end to find 7
    // if not found, i++ -> i = 1
    // 6 - 2 = 4 -> search from i = 2 tp end to find 4

    // maybe sort first and then stop at the index where the value is bigger than
    // the target
    // that'll be a O(n ^ 2) solution

    // use HashMap so I can get O(n) time complexity
    // <key, value> -> <num i.e. the value, index>
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    int[] result = new int[2];

    // loop through nums
    // target - nums[i] = search
    // if search not exists as the HashMap key, add <nums[i], i>
    // if exists, return [map.get(search), i]
    for (int i = 0; i < nums.length; i++) {
      int search = target - nums[i];
      if (!map.containsKey(search)) {
        map.put(nums[i], i);
        continue;
      }
      result[0] = map.get(search);
      result[1] = i;
    }
    return result;
  }
}
