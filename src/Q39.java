

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q39 {

  public class TreeNode {

    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
      this.val = val;

    }

  }

  boolean ans = true;

  public int TreeDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = TreeDepth(root.left);
    int right = TreeDepth(root.right);
    if (Math.abs(left - right) > 1) {
      ans = false;
    }
    return Math.max(left, right) + 1;
  }

  public boolean IsBalanced_Solution(TreeNode root) {
    int i = TreeDepth(root);
    return ans;
  }
}
