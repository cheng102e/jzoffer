/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/12 14:39
 */
public class JZ14I {
    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        for (int i = 2; i < n + 1; i++) {
            int max = 0;
            for (int j = 1; j < i; j++) {
                max = Math.max(max, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = max;
        }
        return dp[n];
    }
}
