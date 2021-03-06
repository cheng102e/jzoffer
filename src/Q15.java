/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-28 11:14
 */
public class Q15 {

  public class ListNode {

    int val;
    ListNode next = null;

    ListNode(int val) {
      this.val = val;
    }
  }

  public ListNode ReverseList(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode pre = null;
    ListNode next = null;
    while (head != null) {
      next = head.next;
      head.next = pre;
      pre = head;
      head = next;
    }
    return pre;
  }
}
