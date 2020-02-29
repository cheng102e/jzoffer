import java.util.Stack;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q20 {

  Stack<Integer> stackdata = new Stack<>();
  Stack<Integer> stackmin = new Stack<>();

  public void push(int node) {
    stackdata.push(node);
    if (stackmin.empty()) {
      stackmin.push(node);
    } else if (node < stackmin.peek()) {
      stackmin.push(node);
    } else {
      stackmin.push(stackmin.peek());
    }
  }

  public void pop() {
    stackmin.pop();
    stackdata.pop();
  }

  public int top() {
    return stackdata.peek();
  }

  public int min() {
    return stackmin.peek();
  }
}
