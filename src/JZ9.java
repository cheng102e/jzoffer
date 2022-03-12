import java.util.Queue;
import java.util.Stack;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/11 23:28
 */
public class JZ9 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    //应该为CQueue
    public JZ9() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        if (stack1.isEmpty()) {
            return -1;
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
