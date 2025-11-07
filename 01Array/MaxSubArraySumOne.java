// Brute Force Approach  TC= O(n^3)
// int arr[] = {1, -2, 6, -1, 3}
// first subArray: (1) , (1, -2) , (1,-2, 6) , (1, -2, 6, -1) , (1, -2, 6, -1, 3)
// second subArray: (-2) , (-2, 6) , (-2, 6, -1) , (-2, 6, -1, 3)
// so on...

public class MaxSubArraySumOne {
    public static void maxSubArraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k = start; k<=end; k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum: "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubArraySum(numbers);
    }    
}
