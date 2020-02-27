/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-26 15:59
 */
public class Q9 {

  public int JumpFloorII(int target) {
    if (target <= 0) {
      return 0;
    }
    int f[] = new int[target + 1];
    f[1] = 1;
    for (int i = 2; i <= target; i++) {
      f[i] = f[i - 1] * 2;
    }
    return f[target];
  }
}
