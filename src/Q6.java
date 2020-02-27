/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-26 15:21
 */
public class Q6 {

  public int minNumberInRotateArray(int[] array) {
    if (array.length == 0) {
      return 0;
    }
    int left = 0;
    int right = array.length - 1;

    while (array[left] >= array[right]) {
      int mid = (left + right) / 2;
      if (array[mid] > array[right]) {
        left = mid + 1;
      } else if (array[mid] == array[right]) {
        right--;
      } else if (array[mid] < array[right]) {
        right = mid;
      }
    }
    return array[left];
  }
}
