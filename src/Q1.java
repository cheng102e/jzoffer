/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/24 18:29
 */
public class Q1 {

  //二维数组中的查找
  public boolean Find(int target, int[][] array) {
    int x0 = 0, y0 = 0;
    int x1 = array.length - 1, y1 = array[0].length - 1;
    boolean ans = false;
    while (x1 >= x0 && y1 >= y0) {
      if (array[x0][y1] == target) {
        ans = true;
        break;
      } else if (array[x0][y1] < target) {
        x0++;
      } else {
        y1--;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println("hello world");
  }
}
