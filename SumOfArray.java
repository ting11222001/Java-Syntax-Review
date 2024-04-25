public class SumOfArray {
  public static void main(String[] args) {
    int[] myArray = { 1, 5, 10, 25 };
    int sum = 0;

    for (int i = 0; i < myArray.length; i++) {
      sum += myArray[i];
    }

    System.out.println("The sum is: " + sum); // 41
  }
}
