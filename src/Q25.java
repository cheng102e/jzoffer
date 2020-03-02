/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q25 {

  public class RandomListNode {

    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
      this.label = label;
    }
  }

  public RandomListNode Clone(RandomListNode pHead) {
    if (pHead == null) {
      return null;
    }
    RandomListNode cur = pHead;
    while (cur != null) {
      RandomListNode nextnode = cur.next;
      RandomListNode clone = new RandomListNode(cur.label);
      cur.next = clone;
      clone.next = nextnode;
      cur = nextnode;
    }
    cur = pHead;
    while (cur != null) {
      cur.next.random = cur.random == null ? null : cur.random.next;
      cur = cur.next.next;
    }
    cur = pHead;
    RandomListNode newHead = pHead.next;
    while (cur != null) {
      RandomListNode clone = cur.next;
      cur.next = clone.next;
      cur = cur.next;
      clone.next = clone.next == null ? null : clone.next.next;
    }
    return newHead;
  }
}
