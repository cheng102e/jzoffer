/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q50 {

  public boolean duplicate(int numbers[], int length, int[] duplication) {
    if (numbers == null || length <= 0) {
      return false;
    }

    for (int i : numbers) {
      if (i < 0 || i > length - 1) {
        return false;
      }
    }
    int[] ans = new int[length];
    for (int i : numbers) {
      if (ans[i] == 0) {
        ans[i] = i;
      } else {
        duplication[0] = i;
        return true;
      }
    }
    return false;
  }
}
