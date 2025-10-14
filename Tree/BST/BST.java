public class BST {

  TreeNodeB root;

  TreeNodeB insert(TreeNodeB root, int value) {
    if (root == null) {
      return new TreeNodeB(value);
    }

    if (root.value > value) {
      root.left = insert(root.left, value);
    }

    if (root.value < value) {
      root.right = insert(root.right, value);
    }
    return root;
  }

  boolean search(TreeNodeB root, int key) {
    if (root == null) {
      return false;
    }
    if (root.value == key) {
      return true;
    }

    return  search(root.left, key) : search(root.right, key);
  }

  void inOrder(TreeNodeB root) {
    if (root == null) {
      return;
    }
    inOrder(root.left);
    System.out.println(root.value + " ");
    inOrder(root.right);
  }

  void preOrder(TreeNodeB root) {
    if (root == null) {
      return;
    }
    System.out.print(root.value + " ");
    preOrder(root.left);
    preOrder(root.right);
  }

  void postOrder(TreeNodeB root) {
    if (root == null) {
      return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.value + " ");
  }

  public static void main(String[] args) {
    BST bst = new BST();

    int[] values = { 50, 30, 70, 20, 40, 60, 80 };
    for (int value : values) {
      bst.root = bst.insert(bst.root, value);
    }

    System.out.println(bst.search(bst.root, 90));
    System.out.println(bst.search(bst.root, 80));
    System.out.print("Inorder Traversal");
    bst.inOrder(bst.root);
    System.out.println("Preorder Traversal");
    bst.preOrder(bst.root);
    System.out.println("Postorder Traversal");
    bst.postOrder(bst.root);
  }
}
