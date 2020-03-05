/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q47 {

  public int Sum_Solution(int n) {
    int sum = n;
    boolean flag = (sum > 0) && ((sum += Sum_Solution(--n)) > 0);
    return sum;
  }
}
