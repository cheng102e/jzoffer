/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q67 {

  public int cutRope(int target) {
    if (target == 2) {
      return 1;
    }
    if (target == 3) {
      return 2;
    }
    int[] dp = new int[target + 1];
    dp[1] = 1;
    dp[2] = 2;
    dp[3] = 3;
    int max = 0;
    for (int i = 4; i <= target; i++) {
      for (int j = 1; j <=i/2 ; j++) {
        max=Math.max(max,dp[j]*dp[i-j]);
      }
      dp[i]=max;
    }
    return dp[target];
  }
}
