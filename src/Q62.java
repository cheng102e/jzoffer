import java.util.Stack;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q62 {

  public class TreeNode {

    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
      this.val = val;

    }

  }

  TreeNode KthNode(TreeNode pRoot, int k) {
    if(pRoot == null || k == 0) {
      return null;
    }
    int count = 0;
    Stack<TreeNode> stack = new Stack<>();
    while (pRoot != null || ! stack.isEmpty()) {
      while (pRoot != null) {
        stack.push(pRoot);
        pRoot = pRoot.left;
      }
      pRoot = stack.pop();
      count ++;
      if(count == k) {
        return pRoot;
      }
      pRoot = pRoot.right;
    }
    return null;
  }
}
