class ListNode {

  ListNode next;
  int val;

  public ListNode(int data) {
    this.next = null;
    this.val = data;
  }
}

public class SLL {

  ListNode head;
  int size;

  public SLL() {
    this.head = null;
    this.size = 0;
  }

  void insert(int value, int location) {
    ListNode node = new ListNode(value);
    if (head == null) {
      this.head = node;
      size = 1;
      return;
    }

    if (location == 0) {
      node.next = head;
      head = node;
      size++;
      return;
    }

    if (location >= size) {
      ListNode temp = head;

      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = node;
      node.next = null;
      size++;
      return;
    } else {
      ListNode temp = head;

      for (int i = 0; i < location - 1; i++) {
        temp = temp.next;
      }
      node.next = temp.next;
      temp.next = node;
    }
    size++;
  }

  void traverse() {
    ListNode temp = head;

    while (temp != null) {
      System.out.println(temp.val);
      temp = temp.next;
    }
  }

  void delete(int location) {
    if (head == null) {
      return;
    }
    if (location == 0) {
      head = head.next;
      size--;
    }
    if (location == size - 1) {}
  }

  void search(int value) {
    ListNode temp = head;
    while (temp != null) {
      if (temp.val == value) {
        System.out.println("Value is found");
        return;
      }
      temp = temp.next;
    }

    System.out.println("Value is not found");
  }

  public static void main(String[] args) {
    SLL sll = new SLL();
    sll.insert(0, 0);
    sll.insert(2, 1);
    sll.insert(1, 1);
    System.out.println(sll.size);
    sll.traverse();
    sll.search(2);
  }
}
