import java.util.ArrayList;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q41 {

  public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    int l = 1;
    int r = 2;
    while (l < r) {
      int num = (r - l + 1) * (l + r) / 2;
      if (num == sum) {
        ArrayList<Integer> one = new ArrayList<>();
        for (int i = l; i <= r; i++) {
          one.add(i);
        }
        list.add(one);
        r++;
      } else if (sum > num) {
        r++;
      } else {
        l++;
      }
    }
    return list;
  }
}
