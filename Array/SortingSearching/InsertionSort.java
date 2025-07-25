import java.util.Comparator;
import java.util.PriorityQueue;

public class InsertionSort {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int n = arr.length;

    PriorityQueue<Integer> pq = new PriorityQueue<>(
      Comparator.comparingInt((a, b) -> b - a)
    );

    for (int i = 0; i < arr.length; i++) {
      pq.add(arr[i]);
    }

    System.out.println(pq.poll());

    for (int i = 1; i < n; i++) {
      int j = i - 1;
      int key = arr[i];

      while (j >= 0 && arr[j] < key) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }
  }
}
