// Q7. Reverse an array with and without using 2nd array.
// For better space complexity use swap

public class ReverseArray {

    // Second method for revers array using swap
    public static void reverse(int arr[]){
        int first = 0;
        int last = arr.length - 1;
        while(first<last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }
    public static void reverseUsingSecondArray(int arr[]){
        int rev[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            rev[rev.length-1-i] = arr[i];
        }
        System.out.print("Revers array using second array: ");
        for(int j=0; j<rev.length; j++){
            System.out.print(rev[j] + " ");
        }
    }

    public static void reverseArray(int arr[]){
        for(int k=0; k<arr.length/2; k++){
            int temp = arr[k];
            arr[k] = arr[arr.length - 1 - k];
            arr[arr.length-1-k] = temp;
        }
        System.out.print("Revers array without using second array: ");
        for(int k= 0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }

    public static void main(String[] args) {
    int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
    reverseUsingSecondArray(arr);
    System.out.println();
    reverseArray(arr);

    }
}