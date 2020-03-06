import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q59 {

  public class TreeNode {

    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
      this.val = val;

    }

  }

  public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    if (pRoot == null) {
      return ans;
    }
    Stack<TreeNode> odd = new Stack<>();
    Stack<TreeNode> even = new Stack<>();
    odd.push(pRoot);
    boolean isodd = true;
    while (!(odd.empty() && even.empty())) {
      ArrayList<Integer> list = new ArrayList<>();
      if (isodd) {
        while (!odd.empty()) {
          TreeNode temp = odd.pop();
          list.add(temp.val);
          if (temp.left != null) {
            even.push(temp.left);
          }
          if (temp.right != null) {
            even.push(temp.right);
          }
        }
        ans.add(list);
        isodd = false;
      } else {
        while (!even.empty()) {
          TreeNode temp = even.pop();
          list.add(temp.val);
          if (temp.right != null) {
            odd.push(temp.right);
          }
          if (temp.left != null) {
            odd.push(temp.left);
          }
        }
        ans.add(list);
        isodd = true;
      }
    }
    return ans;
  }
}
