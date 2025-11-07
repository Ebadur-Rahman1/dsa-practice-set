// For better time complexity use KADANE'S Algorithm. TC = O(n)
// int arr[] = {1, -2, 6, -1, 3}
// first subArray: (1) , (1, -2) , (1,-2, 6) , (1, -2, 6, -1) , (1, -2, 6, -1, 3)
// second subArray: (-2) , (-2, 6) , (-2, 6, -1) , (-2, 6, -1, 3)
// so on...

public class MaxSubArraySumThree {
    public static void maxSubArraySum(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs<0)    cs = 0;
            ms = Math.max(cs,ms);
        }
        System.out.println("Our Max subArray sum "+ms);
    }
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubArraySum(numbers);
    }
}
