import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/24 19:23
 */
public class Q3 {

  public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  //从尾到头打印链表
  public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    Stack<Integer> stack = new Stack<Integer>();
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    if (listNode == null) {
      return arrayList;
    }
    while (true) {
      int temp = listNode.val;
      stack.push(temp);
      if (listNode.next == null) {
        break;
      }
      listNode = listNode.next;
    }
    while (!stack.isEmpty()) {
      arrayList.add(stack.pop());
    }
    return arrayList;
  }

  public static void main(String[] args) {
    System.out.println("hello world");
  }
}
