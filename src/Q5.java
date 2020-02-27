import java.util.Stack;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-26 15:04
 */
public class Q5 {

  Stack<Integer> stack1 = new Stack<Integer>();
  Stack<Integer> stack2 = new Stack<Integer>();

  public void push(int node) {
    stack1.push(node);
  }

  public int pop() {
    if (stack2.empty()) {
      while (!stack1.empty()) {
        int temp = stack1.pop();
        stack2.push(temp);
      }
    }
    int temp = stack2.peek();
    stack2.pop();
    return temp;
  }
}
