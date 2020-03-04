/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q33 {

  public int GetUglyNumber_Solution(int index) {
    if (index == 0) {
      return 0;
    }
    int[] ans = new int[index];
    int n2 = 0, n3 = 0, n5 = 0;
    ans[0] = 1;
    for (int i = 1; i < index; i++) {
      int min = Math.min(ans[n2] * 2, Math.min(ans[n3] * 3, ans[n5] * 5));
      ans[i] = min;
      if (min == ans[n2] * 2) {
        n2++;
      }
      if (min == ans[n3] * 3) {
        n3++;
      }
      if (min == ans[n5] * 5) {
        n5++;
      }

    }
    return ans[index - 1];
  }
}
