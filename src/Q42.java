import java.util.ArrayList;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q42 {

  public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
    ArrayList<Integer> list = new ArrayList<>();
    int l = 0;
    int r = array.length - 1;
    int a = 0;
    int b = 0;
    int mul = Integer.MAX_VALUE;
    while (l < r) {
      int num = array[l] + array[r];
      if (num == sum) {
        int temp = array[l] * array[r];
        if (temp < mul) {
          mul = temp;
          a = array[l];
          b = array[r];
        }
        r--;
      } else if (sum > num) {
        l++;
      } else {
        r--;
      }
    }
    if (a != 0 && b != 0) {
      list.add(a);
      list.add(b);
    }
    return list;
  }
}
