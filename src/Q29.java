import java.util.*;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q29 {

  public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {

    ArrayList<Integer> ans = new ArrayList<>();
    if (input == null || k <= 0 || k > input.length) {
      return ans;
    }
    Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);

    for (int i = 0; i < input.length; i++) {

      if (queue.size() < k) {
        queue.add(input[i]);
      } else {
        if (input[i] < queue.peek()) {
          queue.remove();
          queue.add(input[i]);
        }
      }
    }
    while (!queue.isEmpty()) {
      ans.add(queue.remove());
    }
    return ans;
  }
}
