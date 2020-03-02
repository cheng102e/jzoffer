/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q26 {

  public class TreeNode {

    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
      this.val = val;
    }
  }

  TreeNode ans = null;

  public TreeNode Convert(TreeNode pRootOfTree) {
    if (pRootOfTree == null) {
      return pRootOfTree;
    }
    Convert(pRootOfTree.right);
    if (ans == null) {
      ans = pRootOfTree;
    } else {
      ans.left = pRootOfTree;
      pRootOfTree.right = ans;
      ans = pRootOfTree;
    }
    Convert(pRootOfTree.left);
    return ans;
  }

}
