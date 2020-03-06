/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q66 {

  public int movingCount(int threshold, int rows, int cols) {
    int flag[][] = new int[rows][cols];
    return find(0, 0, rows, cols, flag, threshold);
  }

  public int find(int i, int j, int rows, int cols, int[][] flag, int threshold) {
    if (i < 0 || i >= rows || j < 0 || j >= cols || sum(i) + sum(j) > threshold
        || flag[i][j] == 1) {
      return 0;
    }
    flag[i][j] = 1;
    return find(i - 1, j, rows, cols, flag, threshold)
        + find(i + 1, j, rows, cols, flag, threshold)
        + find(i, j - 1, rows, cols, flag, threshold)
        + find(i, j + 1, rows, cols, flag, threshold)
        + 1;
  }

  public int sum(int i) {
    int sum = 0;
    while (i > 0) {
      sum += i % 10;
      i /= 10;
    }
    return sum;
  }
}
