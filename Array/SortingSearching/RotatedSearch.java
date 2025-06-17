public class RotatedSearch {

  private static int rotatedSearch(int[] arr, int num) {
    int index = -1;
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {
      int mid = (high + low) / 2;

      if (arr[mid] == num) return mid;

      if (arr[low] <= arr[mid]) {
        if (arr[low] <= arr[mid] && num < arr[mid]) {
          high = mid - 1;
        } else {
          low = mid + 1;
        }
      } else {
        if (arr[mid] <= num && num <= arr[high]) {
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }
    }

    return index;
  }

  public static void main(String[] args) {
    int[] arr = { 4, 5, 6, 1, 2, 3 };

    int index = rotatedSearch(arr, 5);
    System.out.println(index);
  }
}
