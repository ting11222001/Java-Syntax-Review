/*
 * https://www.youtube.com/watch?v=cgQi0YPBcD0&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=25&ab_channel=DineshVaryani
 */

public class FindMinValueInArray {

  public static int findMinValue(int[] arr) {
    int min = arr[0];
    for (int i : arr) {
      if (i < min) {
        min = i;
      }
    }

    return min;
  }

  public static void main(String[] args) {
    int[] numbers = { 5, 9, 3, 15, 1, 2 };
    System.out.println("The min value: " + findMinValue(numbers)); // 1
  }
}
