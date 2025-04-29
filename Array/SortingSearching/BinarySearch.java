public class BinarySearch{
    
    private static int binarSearch(int[] arr, int num) {
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {
        int mid = (low + high) / 2;  // ✅ Recalculate mid on each iteration

        if (arr[mid] == num) {
            return mid;
        } else if (arr[mid] > num) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return -1;
}


    public static void main(String[] args){
       
       int[] arr = {1,2,3,4};
       int ans = binarSearch(arr,3);
       System.out.println(ans);
    }
}