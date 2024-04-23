/*
 * https://www.youtube.com/watch?v=wvz5Jz_PW_8&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=28&ab_channel=DineshVaryani
 */

public class MoveZeroToEndOfArr {

  public static void moveZeros(int[] arr, int n) {
    System.out.println("n: " + n); // n: 7
    int zeroIdx = 0; // one pointer to the zero element and another for nonzero one
    int nonZeroIdx;

    for (nonZeroIdx = 0; nonZeroIdx < n; nonZeroIdx++) { // nonZeroIdx: 7
      if (arr[nonZeroIdx] != 0 && arr[zeroIdx] == 0) { // zeroIdx: 5
        int temp = arr[nonZeroIdx];
        arr[nonZeroIdx] = arr[zeroIdx];
        arr[zeroIdx] = temp;
      }

      if (arr[zeroIdx] != 0) {
        zeroIdx++;
      }
    }

    for (int i : arr) {
      System.out.println("Result: " + i);
      /*
       * Result: 8
       * Result: 1
       * Result: 2
       * Result: 1
       * Result: 3
       * Result: 0
       * Result: 0
       */
    }
  }

  public static void main(String[] args) {
    int[] input = { 8, 1, 0, 2, 1, 0, 3 };
    // 8 1 0 2 1 0 3
    // 8 1 2 0 1 0 3
    // 8 1 2 1 0 0 3
    // 8 1 2 1 3 0 0
    moveZeros(input, input.length);
  }
}
