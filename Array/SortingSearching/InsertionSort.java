public class InsertionSort {

  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1 };
    int n = arr.length;

    for (int i = 1; i < n; i++) {
      int j = i - 1;
      int key = arr[i];

      while (j >= 0 && arr[j] > key) {
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
