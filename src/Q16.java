/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-28 15:41
 */
public class Q16 {

  public class ListNode {

    int val;
    ListNode next = null;

    ListNode(int val) {
      this.val = val;
    }
  }

  public ListNode Merge(ListNode list1, ListNode list2) {
    if (list1 == null) {
      return list2;
    }
    if (list2 == null) {
      return list1;
    }
    ListNode base = null;
    ListNode now = null;
    while (list1 != null && list2 != null) {
      if (list1.val <= list2.val) {
        if (base == null) {
          base = list1;
          now = list1;
        } else {
          now.next = list1;
          now = now.next;
        }
        list1 = list1.next;
      } else {
        if (base == null) {
          base = list2;
          now = list2;
        } else {
          now.next = list2;
          now = now.next;
        }
        list2 = list2.next;
      }
    }
    if (list1 == null) {
      now.next = list2;
    } else {
      now.next = list1;
    }
    return base;
  }
}
