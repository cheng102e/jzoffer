
import java.util.*;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q60 {

  public class TreeNode {

    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
      this.val = val;

    }

  }

  ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    if (pRoot == null) {
      return ans;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    ArrayList<Integer> list = new ArrayList<>();
    queue.add(pRoot);
    int start = 0, end = 1;
    while (!queue.isEmpty()) {
      TreeNode cur = queue.remove();
      list.add(cur.val);
      start++;
      if (cur.left != null) {
        queue.add(cur.left);
      }
      if (cur.right != null) {
        queue.add(cur.right);
      }
      if (start == end) {
        end = queue.size();
        start = 0;
        ans.add(list);
        list = new ArrayList<>();
      }
    }
    return ans;
  }
}
