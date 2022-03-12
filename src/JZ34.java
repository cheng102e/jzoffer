import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/12 16:24
 */
public class JZ34 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root == null) {
            return result;
        }
        path.add(root.val);
        backtracking(root, target, root.val);
        return result;
    }

    private void backtracking(TreeNode node, int target, int sum) {
        if (node.left == null && node.right == null && sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }
        if (node.left != null) {
            path.add(node.left.val);
            backtracking(node.left, target, sum + node.left.val);
            path.remove(path.size() - 1);
        }
        if (node.right != null) {
            path.add(node.right.val);
            backtracking(node.right, target, sum + node.right.val);
            path.remove(path.size() - 1);
        }

    }
}
