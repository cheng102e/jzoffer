/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q36 {

  public class ListNode {

    int val;
    ListNode next = null;

    ListNode(int val) {
      this.val = val;
    }
  }

  public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    if (pHead1 == null || pHead2 == null) {
      return null;
    }
    ListNode p1 = pHead1;
    ListNode p2 = pHead2;
    int len1 = 0;
    int len2 = 0;
    while (p1.next != null) {
      len1++;
      p1 = p1.next;
    }
    while (p2.next != null) {
      len2++;
      p2 = p2.next;
    }
    p1 = pHead1;
    p2 = pHead2;
    if (len1 > len2) {
      for (int i = len1 - len2; i >= 0; i--) {
        p1 = p1.next;
      }
    } else {
      for (int i = len2 - len1; i >= 0; i--) {
        p2 = p2.next;
      }
    }
    while (p1 != p2) {
      p1 = p1.next;
      p2 = p2.next;
    }
    return p1;
  }

}
