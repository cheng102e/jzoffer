/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q37 {

  public int search(int[] array, double k) {
    int l = 0;
    int r = array.length - 1;
    int m = (r - l) / 2 + l;
    while (l <= r) {
      if (array[m] < k) {
        l = m + 1;
      } else {
        r = m - 1;
      }
      m = (r - l) / 2 + l;
    }
    return l;
  }

  public int GetNumberOfK(int[] array, int k) {
    int start = search(array, k - 0.5);
    int end = search(array, k + 0.5);
    return end - start;
  }

}
