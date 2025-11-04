// Find the smallest number in a given array.

public class SmallestNumber {
    public static int findSmallestNumber(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 10, 20, 50};
        int result = findSmallestNumber(arr);
        System.out.print("Smallest number is: "+result);
    }
}