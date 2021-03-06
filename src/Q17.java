/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 12:24
 */
public class Q17 {

  public class TreeNode {

    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
      this.val = val;
    }
  }

  public boolean HasSubtree(TreeNode root1, TreeNode root2) {
    boolean result = false;

    if (root1 != null && root2 != null) {
      if (root1.val == root2.val) {
        result = Does1Has2(root1, root2);
      }
      if (!result) {
        result = HasSubtree(root1.left, root2);
      }
      if (!result) {
        result = HasSubtree(root1.right, root2);
      }
    }
    return result;
  }

  public boolean Does1Has2(TreeNode root1, TreeNode root2) {
    if (root2 == null) {
      return true;
    }
    if (root1 == null) {
      return false;
    }
    if (root1.val != root2.val) {
      return false;
    }
    return Does1Has2(root1.left, root2.left) && Does1Has2(root1.right, root2.right);
  }
}
