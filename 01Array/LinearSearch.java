// Q1. Linear Search: Find the index of element in given array
// 2, 4, 6, 8, 10, 12, 14, 16 key = 10

public class LinearSearch {

    public static int arrayIndex(int arr[], int key){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 17;
        int result = arrayIndex(arr,key);
        if(result == -1){
            System.out.print("Element not found. ");
        } else {
            System.out.print("Element present at "+result);
        }
    }
}