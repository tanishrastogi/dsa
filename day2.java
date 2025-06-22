import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the arr: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i<n; i++ ){
            arr[i] = sc.nextInt();
        }

        // problem53(arr);
        problem136(arr);
    }

    public static int problem53(int arr[]) {
            // Maximum subarray.
            int nums[] = arr;
            int currentSum = nums[0];
            int maxSum = nums[0];

            for (int i = 1; i < nums.length; i++) {
                currentSum = Math.max(nums[i], currentSum + nums[i]);
                maxSum = Math.max(maxSum, currentSum);
            }

            return maxSum;
// [-2,4,8]
        
    }

    public static int problem136(int arr[]){
        // return the single number
        int result = 0;
        for(int i = 0 ; i<arr.length ; i++){
            result ^= arr[i];  
        }
        return result;
        
    }
}