import java.util.ArrayList;
import java.util.List;

public class TreeNode {

  String data;
  List<TreeNode> children;


  public TreeNode(String data) {
    this.data = data;
    this.children = new ArrayList<>();
  }

  public void addChild(TreeNode child) {
    this.children.add(child);
  }

  public void printTree(String prefix) {
    System.out.println(prefix + data);
    for (TreeNode child : children) {
      child.printTree(prefix + "  ");
    }
  }
}
