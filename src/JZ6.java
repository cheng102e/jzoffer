import java.util.Stack;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/11 22:57
 */
public class JZ6 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.add(head.val);
            head = head.next;
        }
        int size = stack.size();
        int[] ans = new int[size];

        for (int i = 0; i < size; i++) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}
