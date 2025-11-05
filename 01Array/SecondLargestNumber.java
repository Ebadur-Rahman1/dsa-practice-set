// Q3. Find the second largest number
public class SecondLargestNumber {
    public static int findSecondLargestNumber(int arr[]){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            int temp = arr[i];
            if(temp>largest){
                secondLargest = largest;
                largest = temp;
            } else if(temp<largest && temp>secondLargest){
                secondLargest = temp;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 15, 20, 35,22};
        int result = findSecondLargestNumber(arr);
        System.out.print("Second largest number is: "+result);
    }
}