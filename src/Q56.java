/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q56 {

  public class ListNode {

    int val;
    ListNode next = null;

    ListNode(int val) {
      this.val = val;
    }
  }

  public ListNode deleteDuplication(ListNode pHead) {
    if (pHead == null) {
      return null;
    }

    ListNode newhead = new ListNode(1);
    newhead.next = pHead;
    ListNode cur = pHead;
    ListNode pre = newhead;
    while (cur != null) {
      if (cur.next != null && cur.val == cur.next.val) {
        while (cur.next != null && cur.val == cur.next.val) {
          cur = cur.next;
        }
        pre.next = cur.next;
        cur = cur.next;
      } else {
        pre = pre.next;
        cur = cur.next;
      }
    }
    return newhead.next;
  }
}
