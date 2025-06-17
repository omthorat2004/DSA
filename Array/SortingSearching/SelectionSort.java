public class SelectionSort {

  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1 };
    int n = 5;
    for (int i = 0; i < n - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[i] > arr[j]) {
          minIndex = j;
        }
      }

      if (i != minIndex) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }
  }
}
