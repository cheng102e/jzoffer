import java.util.*;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-26 14:38
 */
public class Q4 {

  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
    if (pre.length == 0 || in.length == 0) {
      return null;
    }
    TreeNode root = new TreeNode(pre[0]);
    for (int i = 0; i < in.length; i++) {
      if (pre[0] == in[i]) {
        root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1),
            Arrays.copyOfRange(in, 0, i));
        root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length),
            Arrays.copyOfRange(in, i + 1, in.length));
      }
    }
    return root;
  }

  public static void main(String[] args) {
    System.out.println("hello world");
  }
}
