/*
 * https://www.youtube.com/watch?v=PaQA-9mHMRY&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=32&ab_channel=DineshVaryani
 */

public class FindMissingNum {
  public static void findMissingNum(int[] arr, int n) {
    int sumFirstN = (n * (n + 1)) / 2;
    int result;

    for (int i : arr) {
      sumFirstN = sumFirstN - i;
    }

    result = sumFirstN;
    System.out.println("The missing number: " + result);
    // The missing number: 4
  }

  public static void main(String[] args) {
    int[] input = { 1, 2, 3, 5 };
    int n = 5;
    findMissingNum(input, n);
  }
}
