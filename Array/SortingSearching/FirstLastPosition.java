// Problem Statement -
// Given a sorted array of integers nums and a target value target, return the starting and ending position of target in the array.

// If target is not found in the array, return [-1, -1].


public class FirstLastPosition{

    public static void main(String[] args){
        int[] arr = {2,2,2,2,2,2};

        int first = findFirst(arr,2);
        int last = findLast(arr,2);
        int[] result = new int[]{first,last};
        System.out.println(result[0]+" "+result[1]);   
    }

    private static int findFirst(int[] arr,int num){
        int low = 0;
        int high = arr.length-1;
        int result = -1;


        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==num){
                result = mid;
                high = mid-1;
            }else if(arr[mid]>num){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return result;
    }

    private static int findLast(int[] arr,int num){
        int high = arr.length-1;
        int low = 0;
        int result = -1;

        while(low<=high){
            int mid = (high+low)/2;

            if(arr[mid]==num){
                result = mid;
                low = mid+1;
            }else if(arr[mid]>num){
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return result;

    }
}