/*
 * https://www.youtube.com/watch?v=PkrEpxfhSao&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=23&ab_channel=DineshVaryani
 * https://www.youtube.com/watch?v=YrTJFPa9CpM&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=24&ab_channel=DineshVaryani
 */
public class ReverseArray {
  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i] + " ");
    }

    System.out.println();
  }

  public static void reverseArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }

    printArray(arr);
  }

  public static void main(String[] args) {
    int[] numbers = { 2, 11, 5, 10, 7, 8 };

    printArray(numbers);
    /*
     * 2
     * 11
     * 5
     * 10
     * 7
     * 8
     */

    reverseArray(numbers);
    /*
     * 8
     * 7
     * 10
     * 5
     * 11
     * 2
     */
  }
}
