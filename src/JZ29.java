/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/12 15:06
 */
public class JZ29 {
    public int[] spiralOrder(int[][] matrix) {
        int maxX = matrix[0].length;
        int maxY = matrix.length;
        int[] ans = new int[maxX * maxY];
        int up = 0, right = maxX - 1, left = 0, down = maxY - 1;
        int i = 0, j = 0, count = 1;
        int tag = 2;
        //右下左上
        ans[0] = matrix[0][0];
        while (count < maxX * maxY) {
            if (tag == 1) {
                if (i > up) {
                    i--;
                    ans[count++] = matrix[i][j];
                } else if (i == up) {
                    tag = 2;
                    left++;

                }
            } else if (tag == 2) {
                if (j < right) {
                    j++;
                    ans[count++] = matrix[i][j];
                } else if (j == right) {
                    tag = 3;
                    up++;
                }
            } else if (tag == 3) {
                if (i < down) {
                    i++;
                    ans[count++] = matrix[i][j];
                } else if (i == down) {
                    tag = 4;
                    right--;
                }
            } else if (tag == 4) {
                if (j > left) {
                    j--;
                    ans[count++] = matrix[i][j];
                } else if (j == left) {
                    tag = 1;
                    down--;
                }
            }
        }
        return ans;
    }
}
