/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q58 {

  public class TreeNode {

    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
      this.val = val;

    }

  }

  public boolean test(TreeNode p1, TreeNode p2) {
    if (p1 == null && p2 == null) {
      return true;
    }
    if (p1 != null && p2 != null) {
      return p1.val == p2.val && test(p1.left, p2.right) && test(p1.right, p2.left);
    }
    return false;
  }

  boolean isSymmetrical(TreeNode pRoot) {
    if (pRoot == null) {
      return true;
    }
    return test(pRoot.left, pRoot.right);
  }
}
