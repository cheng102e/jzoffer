import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q24 {

  public class TreeNode {

    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
      this.val = val;

    }

  }

  public void find(TreeNode root, int target, ArrayList<ArrayList<Integer>> all, ArrayList list) {
    if (root == null) {
      return;
    }
    int value = root.val;
    list.add(value);
    if (target == value && root.left == null && root.right == null) {
      all.add(new ArrayList<>(list));
    } else {
      find(root.left, target - value, all, list);
      find(root.right, target - value, all, list);
    }
    list.remove(list.size() - 1);
  }

  public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
    ArrayList<ArrayList<Integer>> all = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    find(root, target, all, list);
    Collections.sort(all, ((o1, o2) -> o2.size() - o1.size()));
    return all;
  }
}
