/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/12 14:04
 */
public class JZ15 {
    public class ListNode {

        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {
        if(head ==null){
            return null;
        }
        ListNode pre = new ListNode(0);
        ListNode cur = head;
        while(head!=null){
            cur = head.next;
            head.next = pre.next;
            pre = head;
            head = cur;
        }

        return pre;
    }

}
