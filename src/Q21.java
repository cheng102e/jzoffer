import java.util.Stack;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q21 {

  public boolean IsPopOrder(int[] pushA, int[] popA) {
    Stack<Integer> stack = new Stack<>();
    int len = pushA.length;

    int in = 0, out = 0;
    for (; in < len; in++) {

      stack.push(pushA[in]);

      while (!stack.empty() && stack.peek() == popA[out]) {
        stack.pop();
        out++;
      }
    }

    return stack.empty();
  }
}
