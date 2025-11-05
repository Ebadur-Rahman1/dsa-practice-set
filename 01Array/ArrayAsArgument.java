//Q5. Passing array as an argument to explain pass by value and pass by reference

public class ArrayAsArgument {
    public static void passByReferenceAndValue(int arr[], int nonChangable){
        for(int j=0; j<arr.length; j++){
            arr[j] = arr[j] + 1;
        }
        nonChangable = nonChangable + 1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12};
        int nonChangable = 10;
        System.out.println("Array element before calling: ");

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Variable value before calling: "+ nonChangable);

        passByReferenceAndValue(arr, nonChangable);

        System.out.print("Array element after calling function: ");
        for(int k=0; k<arr.length; k++){
        System.out.print(arr[k] + " ");
        }
        System.out.println();
        System.out.println("Variable value after calling: "+nonChangable);
        
    }
}