/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q35 {

  long count = 0;

  public void merge(int[] array, int[] copy, int start, int end) {
    if (start >= end) {
      return;
    }

    int mid = (end - start) / 2 + start;
    merge(array, copy, start, mid);
    merge(array, copy, mid + 1, end);
    int l = start;
    int r = mid + 1;
    int temp = start;
    while (l <= mid && r <= end) {
      if (array[l] <= array[r]) {
        copy[temp++] = array[l++];
      } else {
        count += mid - l + 1;
        copy[temp++] = array[r++];
        if (count > 1000000007) {
          count %=  1000000007;
        }
      }
    }
    while (l <= mid) {
      copy[temp++] = array[l++];
    }
    while (r <= end) {
      copy[temp++] = array[r++];
    }
    for (int i = start; i <= end; i++) {
      array[i] = copy[i];
    }
  }

  public int InversePairs(int[] array) {
    int start = 0;
    int end = array.length - 1;
    int[] copy = new int[array.length];
    merge(array, copy, start, end);
    return (int) count;
  }
}
