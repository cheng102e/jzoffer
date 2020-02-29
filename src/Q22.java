import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q22 {

  public class TreeNode {

    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
      this.val = val;

    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
      ArrayList<Integer> list = new ArrayList<>();
      Queue<TreeNode> queue = new LinkedList<>();
      if (root == null) {
        return list;
      }
      queue.offer(root);
      while (!queue.isEmpty()) {
        TreeNode temp = queue.poll();
        if (temp.left != null) {
          queue.offer(temp.left);
        }
        if (temp.right != null) {
          queue.offer(temp.right);
        }
        list.add(temp.val);
      }
      return list;
    }
  }
}
