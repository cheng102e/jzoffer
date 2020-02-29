import java.util.ArrayList;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 13:09
 */
public class Q19 {

  public ArrayList<Integer> printMatrix(int[][] matrix) {
    ArrayList<Integer> list = new ArrayList<>();
    int EndX = matrix.length - 1;
    int EndY = matrix[0].length - 1;
    int StartX = 0;
    int StartY = 0;
    int x = StartX, y = StartY;
    while (StartX <= EndX && StartY <= EndY) {
      if (StartX <= EndX) {
        while (y <= EndY) {
          list.add(matrix[x][y]);
          y++;
        }
        y--;
        StartX++;
        x = StartX;
      }
      if (StartY <= EndY) {
        while (x <= EndX) {
          list.add(matrix[x][y]);
          x++;
        }
        x--;
        EndY--;
        y = EndY;
      }
      if (StartX <= EndX) {
        while (y >= StartY) {
          list.add(matrix[x][y]);
          y--;
        }
        y++;
        EndX--;
        x = EndX;
      }
      if (StartY <= EndY) {
        while (x >= StartX) {
          list.add(matrix[x][y]);
          x--;
        }
        x++;
        StartY++;
        y = StartY;
      }
    }
    return list;
  }
}
