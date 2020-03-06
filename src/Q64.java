import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q64 {

  public ArrayList<Integer> maxInWindows(int[] num, int size) {

    ArrayList<Integer> ans = new ArrayList<>();
    if (num == null) {
      return ans;
    }
    if (num.length < size || size < 1) {
      return ans;
    }

    LinkedList<Integer> list = new LinkedList<>();
    for (int i = 0; i < size - 1; i++) {
      while (!list.isEmpty() && num[i] > num[list.getLast()]) {
        list.removeLast();
      }
      list.addLast(i);
    }

    for (int i = size - 1; i < num.length; i++) {
      while (!list.isEmpty() && num[i] > num[list.getLast()]) {
        list.removeLast();
      }
      list.addLast(i);
      if (i - list.getFirst() + 1 > size) {
        list.removeFirst();
      }
      ans.add(num[list.getFirst()]);
    }
    return ans;
  }
}
