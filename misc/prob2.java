package misc;

import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            System.out.print("Enter element: "+i+" ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number: ");
        int k = sc.nextInt();
        problem2(arr,k);

    }

    public static void problem2(int[] nums, int k){
        // longest subarray with sum not more than k
        // using sliding window.

        // left side shrinks and right side extends  
        int n =nums.length;
        int sum = 0;
        int l = 0, r = 0;
        int length = 0;
        while (r<n) {
            sum+=nums[r]; 
            while (sum>k) { 
                sum = sum - nums[l];
                l++;
            }
            if(sum<=k){

            }
            length = Math.max(length, r-l+1);
            r=r+1;
        }
        System.out.println(length);

        
    }
}