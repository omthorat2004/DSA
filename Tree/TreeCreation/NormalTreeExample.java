public class NormalTreeExample {

  public static void main(String[] args) {
    TreeNode root = new TreeNode("Root");

    TreeNode child1 = new TreeNode("Child 1");
    TreeNode child2 = new TreeNode("Child 2");
    TreeNode child3 = new TreeNode("Child 3");

    root.addChild(child1);
    root.addChild(child2);
    root.addChild(child3);

    TreeNode child11 = new TreeNode("Child 1.1");
    TreeNode child12 = new TreeNode("Child 1.2");

    child1.addChild(child11);
    child1.addChild(child12);

    TreeNode child21 = new TreeNode("Child 2.1");
    child2.addChild(child21);

    System.out.println("Tree structure:");
    root.printTree("");
  }
}
