/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q55 {

  public class ListNode {

    int val;
    ListNode next = null;

    ListNode(int val) {
      this.val = val;
    }
  }

  public ListNode EntryNodeOfLoop(ListNode pHead) {
    ListNode fast = pHead;
    ListNode slow = pHead;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (fast == slow) {
        break;
      }
    }
    if (fast == null || fast.next == null) {
      return null;
    }
    fast = pHead;
    while (fast != slow) {
      fast = fast.next;
      slow = slow.next;
    }
    return fast;
  }
}
