/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/24 17:45
 */
public class AT {
  public static int JumpFloor(int target) {
    if (target <= 0) {
      return 0;
    }
    if(target==1)
    {
      return 1;
    }
    if (target==2)
    {
      return 2;
    }
    int f[] = new int[target + 1];
    f[1] = 1;
    f[2] = 2;
    for (int i = 3; i <= target; i++) {
      f[i] = f[i - 1] + f[i - 2];
    }
    return f[target];
  }
  public static void main(String[] args) {
    System.out.println(JumpFloor(1));
  }
}
