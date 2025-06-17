import java.util.LinkedList;
import java.util.Queue;

class Node {

  int data;
  Node left, right;

  public Node(int data) {
    this.data = data;
    right = left = null;
  }
}

public class BT {

  Node root;

  public BT() {
    this.root = null;
  }

  public void insert(int data) {
    if (root == null) {
      root = new Node(data);
      return;
    }

    Queue<Node> queue = new LinkedList<>();

    queue.add(root);

    while (!queue.isEmpty()) {
      Node node = queue.poll();

      if (node.left == null) {
        node.left = new Node(data);
        return;
      } else {
        queue.add(node.left);
      }

      if (node.right == null) {
        node.right = new Node(data);
        return;
      } else {
        queue.add(node.right);
      }
    }
  }

  //level order traversal

  public void bfs() {
    Queue<Node> queue = new LinkedList<>();

    queue.add(root);

    while (!queue.isEmpty()) {
      Node node = queue.poll();

      System.out.println(node.data + " ");

      if (node.left != null) {
        queue.add(node.left);
      }

      if (node.right != null) {
        queue.add(node.right);
      }
    }
  }

  public void inOrder(Node root) {
    if (root == null) {
      return;
    }
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);
  }

  public void preOrder(Node root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");

    preOrder(root.left);
    preOrder(root.right);
  }

  public void postOrder(Node root) {
    if (root == null) {
      return;
    }

    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data + " ");
  }

  public static void main(String[] args) {
    BT bt = new BT();

    bt.insert(1);
    bt.insert(2);
    bt.insert(3);
    bt.insert(4);
    bt.insert(5);

    bt.bfs();
    bt.inOrder(bt.root);
  }
}
