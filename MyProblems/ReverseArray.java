public class ReverseArray {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4 };
    int n = arr.length;

    int mid = n / 2;
    System.out.println(mid);

    int i = 0;
    while (i < mid) {
      int temp = arr[i];
      arr[i] = arr[n - 1 - i];
      arr[n - 1 - i] = temp;
      i++;
    }

    for (int j = 0; j < n; j++) {
      System.out.println(arr[j]);
    }
  }
}
