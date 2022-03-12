/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/12 13:34
 */
public class JZ25 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode now = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                now.next = l1;
                l1 = l1.next;
            } else {
                now.next = l2;
                l2 = l2.next;
            }
            now = now.next;
        }
        if (l1 == null) {
            now.next = l2;
        } else {
            now.next = l1;
        }
        return head.next;
    }
}