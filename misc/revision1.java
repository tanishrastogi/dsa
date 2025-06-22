package misc;

import java.util.HashMap;
import java.util.Scanner;

public class revision1 {
    public static void main(String[] args) {
        // System.out.println("Enter Number of elements in the array.");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int arr[] = new int[n];

        // for (int i = 0; i < n; i++) {
        //     System.out.print("Element " + i + ": ");
        //     arr[i] = sc.nextInt();
        // }

        // System.out.println("Enter the value: ");
        // int k = sc.nextInt();
        // // problem1(arr, k);
        // // problem121(arr);
        // problem53();
        problem169();
    }

    public static int[] problem1(int[] nums, int k){
        // two sum
        // brute force: check all possible two sums , and give the indices of the number
        // that sum up to the target

        // optimal
        HashMap <Integer, Integer> map = new HashMap<>();
        int n = nums.length;


        
        // for(int i = 0;i<n;i++){
        //     // int complement = k-nums[i];
        //     // if(map.containsKey(k))
        //     // map.put(complement, i);
        //     int complement = k - nums[i];
        //     if(map.containsKey(complement)){
        //         return new int[] {map.get(complement), i};
        //     }
            
        // }

        for(int i =0;i<n;i++){
            int complement = k - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }



        return new int[] {};
    }

    public static int problem121(int[] nums){
        // best time to buy and sell a stock
        // [7,1,5,3,6,4] 
        
        // dsa tools i have? 
        // two pointers     ? maybe
        // sliding window   ? 
        // hashmap
        // prefix sum 
        
        int maxProfit = 0;
        int minPrice = nums[0];
        int n = nums.length;
        int i = 0;
        while(i<nums.length){
            if(nums[i]<minPrice){
                minPrice = nums[i];
            }
            if(nums[i]-minPrice>maxProfit){
                maxProfit = nums[i] - minPrice;
            }
        }

        return maxProfit;
    
    
    }

    public static int problem53(){

        // brute force , we could just simply use two for loops and check all subarrays for the largest sum.

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int n = nums.length;
        int maxSum = 0;
        for(int i = 0;i<n; i++){
            int sum = 0;
            for(int j = i;j<n;j++){
                sum+=nums[j];
                if(sum>maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
        return maxSum;
    }

    public static int problem169(){
        
        int[] nums = {2,2,1,1,1,2,2};
        
        HashMap <Integer, Integer> map = new HashMap<>(); // (number, frequency)
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
                if(map.get(nums[i])>n/2){
                    return nums[i];
                }
            }
            else{
                map.put(nums[i], 1);
            }
        }

        return nums[0];
    }

    public static int[] problem238(){
        int[] nums = {1,2,3,4};
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = nums[0];
        right[n-1] = nums[n-1];

        // for left side
        for(int i = 1 ; i<n ; i++){
            left[i] = left[i-1]*nums[i];

        }

        // for right side
        for(int i=n-2;i>0;i--){
            right[i] = right[i+1]*nums[i];
            
        }

        return new int[] {};
    }
}