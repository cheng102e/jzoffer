
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-29 15:12
 */
public class Q61 {

  public class TreeNode {

    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
      this.val = val;
    }
  }


  int index;
  String Serialize(TreeNode root) {

    StringBuffer sb = new StringBuffer();
    if(root == null){
      sb.append("#,");
      return sb.toString();
    }
    sb.append(root.val+",");
    sb.append(Serialize(root.left));
    sb.append(Serialize(root.right));
    return sb.toString();
  }
  TreeNode Deserialize(String str) {

    if(str == null){
      return null;
    }
    index = -1;
    String[] strSeg = str.split(",");

    return DeserializeStr(strSeg);

  }

  public TreeNode DeserializeStr(String[] strSeg){
    index++;
    TreeNode treeNode = null;
    if(!strSeg[index].equals("#")){
      treeNode = new TreeNode(Integer.valueOf(strSeg[index]));
      treeNode.left = DeserializeStr(strSeg);
      treeNode.right = DeserializeStr(strSeg);
    }
    return treeNode;
  }
}
