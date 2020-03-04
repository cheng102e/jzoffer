/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q30 {

  public int FindGreatestSumOfSubArray(int[] array) {

    int sum = array[0];
    int max = sum;
    for (int i = 1; i < array.length; i++) {
      if (sum < 0) {
        sum = 0;
      }
      sum += array[i];
      if (sum > max) {
        max = sum;
      }
    }
    return max;
  }
}
