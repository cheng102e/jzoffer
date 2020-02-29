/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-28 10:47
 */
public class Q14 {

  public class ListNode {

    int val;
    ListNode next = null;

    ListNode(int val) {
      this.val = val;
    }
  }

  public ListNode FindKthToTail(ListNode head, int k) {
    if (head == null || k <= 0) {
      return null;
    }
    ListNode ans = head;
    for (int i = 0; i < k - 1; i++) {
      if (head.next != null) {
        head = head.next;
      } else {
        return null;
      }
    }
    while (head.next != null) {
      head = head.next;
      ans = ans.next;
    }
    return ans;
  }
}
