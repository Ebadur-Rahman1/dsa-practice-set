// Find the largest number in a given array.

public class LargestNumber {
    public static int findLargestNumber(int arr[]){
        int min = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(min<arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 12, 18, 50, 25};
        int result = findLargestNumber(arr);
        System.out.print("Largest number of a given array is "+result);
    }
}
