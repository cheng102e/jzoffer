import java.util.ArrayList;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q46 {

  public int LastRemaining_Solution(int n, int m) {
    if (n == 0) {
      return -1;
    }
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      list.add(i);
    }

    int index = (m - 1) % list.size();
    while (list.size() > 1) {
      list.remove(index);
      index = (m - 1 + index) % list.size();
    }
    return list.get(0);
  }
}
