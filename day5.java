// prob930
// prob1248
// prob2261

import java.util.HashMap;
import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        System.out.println("Enter Number of elements in the array.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value: ");
        int k = sc.nextInt();
        
        // problem930(arr, k);
        // problem1248(arr, k);
        problem2261(arr, k, 5);

    }

    public static void problem930(int[] arr, int k){
        // to return the number of subarrays with sum k.
        // int n = arr.length;
        // int c = 0;
        // int[] prefixSum = new int[n];
        // prefixSum[0] = arr[0];
        // HashMap <Integer, Integer> map = new HashMap<>();
        
        // for(int i = 1 ; i<arr.length;i++){
        //     prefixSum[i] = prefixSum[i-1] + arr[i];
        // }

        

        // for(int i = 0; i<n ; i++){
        //     if(prefixSum[i] == k){
        //         c++;
        //     }

        //     if(map.containsKey(prefixSum[i]-k)){
        //         c = c + map.get(prefixSum[i]-k);
        //     }

        //     map.put(prefixSum[i], map.getOrDefault(prefixSum[i], 0)+1);
            

        // }

        // System.out.println(c);
        
        int n = arr.length;
        int prefixSum = arr[0];
        int c = 0;
        HashMap <Integer, Integer> map = new HashMap<>();
        map.put(prefixSum, 1);
        if(prefixSum == k){
            c++;
        }
        for(int i  = 1; i<n;i++){
            prefixSum = prefixSum + arr[i];
            if(prefixSum == k){
                c++;
            }
            if(map.containsKey(prefixSum-k)){
                c = c+map.get(prefixSum-k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);

        }

        System.out.println(c);

    }

    public static int problem1248(int[] nums, int k){
        // count number of nice subarrays
        // nice subarray: if number of odd numbers in subarray = k
        
        int c = 0;
        int n = nums.length;
        int[] arr = nums;
        for(int i =0 ; i<n;i++){
            if(arr[i]%2==0){
                arr[i] = 0;
            }       
            else{
                arr[i] = 1;
            }
            // System.out.println(arr[i]);                 
        }

        int prefixSum = arr[0];
        HashMap <Integer, Integer> map = new HashMap<>();
        map.put(prefixSum, 1);
        for(int i = 0 ; i<n ; i++){
            prefixSum+=arr[i];
            if(arr[i]==k){
                c++;
            }
            if(map.containsKey(prefixSum-k)){
                c+=map.get(prefixSum-k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        }
        // System.out.println(c);
        return c;
    }


    public static int problem2261(int[] nums, int k, int p){
        // k and p will be given 
        // k signifies maximum number of elements that could be present in the array divisible by p.
        // return number of such arrays.
        
        int n = nums.length;
        int c = 0;
        for(int i = 0;i<n;i++){
            int number = 0;
            for(int j = 0;j<n;j++){
                
            }
        }
        return 0;
    }


}