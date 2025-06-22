package misc;

import java.util.*;

public class prob3 {
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
        
        problem3(arr);
    }

    public static List<List<Integer>> problem3(int[] nums){
        // Three Sum problem.
        // brute force : we could use three loops and check for all possible variations 
        
        Arrays.sort(nums);

        // [-1,0,1,2,-1,-4]
        // after sorting [-4,-1,-1,0,1,2] 
        int l = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        for(int i =0 ;i<l;i++){
            if (i>0&&nums[i]==nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    

                    left++;
                    right--;

                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }

            }
        }

        System.out.println(res);

        return res;
    }
}