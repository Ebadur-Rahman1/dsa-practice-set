// Q6. Binary Search: find the index of a given element
// Pre-request: Array must be sorted for binary search

public class BinarySearch {
    public static int findIndex(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid]<key){
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 4;
        int result = findIndex(arr, key);
        if(result == -1){
            System.out.print("Element Not Found: ");
        }else {
            System.out.print("Element found at index "+result);
        }
    }
}