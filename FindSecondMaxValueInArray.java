/*
 * https://www.youtube.com/watch?v=UULE-HyfERc&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=27&ab_channel=DineshVaryani
 */

public class FindSecondMaxValueInArray {

  public static void findSecondMaxValue(int[] arr) {
    int max = Integer.MIN_VALUE; // -2147483648
    int secondMax = Integer.MIN_VALUE; // -2147483648

    for (int i : arr) {
      if (i > max) {
        secondMax = max;
        max = i;
      } else if (i > secondMax && i != max) {
        secondMax = i;
      }
    }

    System.out.println("The max value: " + max);
    System.out.println("The secondMax value: " + secondMax);
  }

  public static void main(String[] args) {
    int[] numbers = { 13, 34, 2, 34, 33, 1 };

    findSecondMaxValue(numbers);
    /*
     * The max value: 34
     * The secondMax value: 33
     */
  }
}
