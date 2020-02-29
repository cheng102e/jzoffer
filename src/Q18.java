/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 12:54
 */
public class Q18 {

  public class TreeNode {

    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
      this.val = val;

    }

  }


  public void Mirror(TreeNode root) {
    if (root != null) {
      TreeNode temp = root.left;
      root.left = root.right;
      root.right = temp;
      if (root.left != null) {
        Mirror(root.left);
      }
      if (root.right != null) {
        Mirror(root.right);
      }
    }
  }
}
