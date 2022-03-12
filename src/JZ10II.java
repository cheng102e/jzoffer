/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/12 8:46
 */
public class JZ10II {
    public int numWays(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) {
            int tmp = a + b;
            a = b;
            b = tmp % 1000000007;
        }
        return b;

    }
}
