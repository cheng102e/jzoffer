/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/11 22:09
 */
public class JZ4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //有效性判定
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        //初始定为右上角
        int x = 0, y = n - 1;
        //向左变小，向下变大
        while (x < m  && y >= 0) {
            int t = matrix[x][y];
            if (t == target) {
                return true;
            } else if (t > target) {
                y--;
            } else if (t < target) {
                x++;
            }
        }
        return false;
    }
}
