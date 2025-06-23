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
        // problem169();
        // problem238();
        problem560();
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
        int[] nums = {1,2,4,3};
        
        int n = nums.length;

        // int[] left = new int[n];
        int[] right = new int[n];
        int[] output = new int[n];

        int left = 1;
        right[n-1] = 1; 

        // for left side
        // for(int i = 1 ; i<n ; i++){
        //     left[i] = left[i-1]*nums[i-1];
        // }

        // for right side
        for(int i=n-2;i>=0;i--){
            right[i] = right[i+1]*nums[i+1];
        }

        // calculating output array
        for(int i = 1;i<n;i++){
            output[i] = left*right[i];
            left = left * nums[i];
            System.out.println(output[i]);
        }

        output[0] = left * right[0];

        return output;
    }

    public static int problem560(){
        
        int k = 2;
        int[] nums = {1,1,1};
        int n = nums.length;
        int c = 0;
        HashMap <Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        map.put(0,1);

        for(int i = 0;i<n;i++){
            prefixSum+=nums[i];
            if(map.containsKey(prefixSum-k)){
                c+=map.get(prefixSum-k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        }

        
        return c;
    }

    public static int problem974(){
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
        int n = nums.length;
        HashMap <Integer, Integer> map = new HashMap<>();
        int[] prefixSum = new int[n];

        int remainder = 1;


        for(int i = 0;i<n;i++){
            
        }

        return 0;
    }
}
