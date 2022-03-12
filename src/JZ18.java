/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/12 13:45
 */
public class JZ18 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) {
            return head.next;
        }
        ListNode now = head;
        ListNode pre = new ListNode(0);
        pre.next = head;
        while (now != null) {
            if (now.val == val) {
                pre.next = now.next;
                break;
            }
            now = now.next;
            pre = pre.next;
        }
        return head;
    }
}
