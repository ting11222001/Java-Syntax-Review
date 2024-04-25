/*
 * https://www.youtube.com/watch?v=s4DPM8ct1pI&ab_channel=NeetCode
 */

public class BinarySearch {
  public int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    int mid;

    while (left <= right) { // equal sign is for when there's only one element.
      mid = (left + right) / 2;

      if (nums[mid] < target) {
        left = mid + 1;
      }

      if (nums[mid] > target) {
        right = mid - 1;
      }

      if (nums[mid] == target) {
        return mid;
      }
    }

    return -1;
  }
}
