/*
 * https://www.youtube.com/watch?v=5rWEio2KoZM&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=22&ab_channel=DineshVaryani
 * https://www.youtube.com/watch?v=lMUcwvVOnnA&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=23&ab_channel=DineshVaryani
 * This approach is showing that the built-in array in Java needs to be created in a fixed size.
 */

public class RemoveEvenInteger {
  public static void printArray(int[] array) {
    int n = array.length;

    for (int i = 0; i < n; i++) {
      System.out.print(array[i] + " ");
    }

    System.out.println();
  }

  public static int[] removeEven(int[] array) {
    int oddCount = 0;

    for (int i = 0; i < array.length; i++) {
      if (i % 2 != 0) {
        oddCount++;
      }
    }

    // System.out.println(oddCount); // 3

    int[] result = new int[oddCount];
    int resultIndex = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 != 0) {
        result[resultIndex] = array[i];
        resultIndex++;
      }
    }

    printArray(result); // 3 7 5
    return result;
  }

  public static void main(String[] args) {
    int[] input = { 3, 2, 4, 7, 10, 6, 5 };
    printArray(input); // 3 2 4 7 10 6 5
    removeEven(input); // 3 7 5
  }
}
