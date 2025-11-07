// For better time complexity use Prefix Sum Method. TC = O(n^2)
// int arr[] = {1, -2, 6, -1, 3}
// first subArray: (1) , (1, -2) , (1,-2, 6) , (1, -2, 6, -1) , (1, -2, 6, -1, 3)
// second subArray: (-2) , (-2, 6) , (-2, 6, -1) , (-2, 6, -1, 3)
// so on...


public class MaxSubArraySumTwo {
    public static void maxSubArraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // Calculate prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

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
