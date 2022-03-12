import java.util.Stack;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/12 14:51
 */
public class JZ31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int length = pushed.length;
        int out = 0;
        for (int i = 0; i < length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && popped[out] == stack.peek()) {
                stack.pop();
                out++;
            }
        }
        return stack.isEmpty();
    }

}
