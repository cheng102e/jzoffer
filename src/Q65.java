/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q65 {

  public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
    boolean[] flag = new boolean[matrix.length];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (judge(matrix, i, j, rows, cols, flag, str, 0)) {
          return true;
        }
      }
    }
    return false;
  }

  public boolean judge(char[] matrix, int i, int j, int rows, int cols, boolean[] flag, char[] str,
      int k) {
    int index = i * cols + j;
    if (i < 0 || j < 0 || i >= rows || j >= cols || matrix[index] != str[k]
        || flag[index] == true) {
      return false;
    }
    if (k == str.length - 1) {
      return true;
    }
    flag[index] = true;

    if (judge(matrix, i - 1, j, rows, cols, flag, str, k + 1) ||
        judge(matrix, i + 1, j, rows, cols, flag, str, k + 1) ||
        judge(matrix, i, j - 1, rows, cols, flag, str, k + 1) ||
        judge(matrix, i, j + 1, rows, cols, flag, str, k + 1)) {
      return true;
    }
    flag[index] = false;
    return false;
  }
}
