// 26/06/2025 - 01/07/2025

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class day7 {
    public static void main(String[] args) {
        // problem125();
        // problem167();
        // problem15();
        // problem11();
        // problem26();
    }

    public static boolean problem125(){
        String s = "abcddcba";
        String rev = "";
        s = s.toLowerCase();
        String copy = s;
        for(int i = 0 ;i<s.length();i++){
            char ch = s.charAt(i);
            int value = (int) ch;
            if((value<97 || value>122)  && !(value >=48 && value<=57)){
               copy = copy.replace(ch+"", "");
            }
        }


        int n = copy.length();

        for(int i = n-1;i>=0;i--){
            System.out.println(s.charAt(i));
            rev = rev+copy.charAt(i);
        }

        if(rev.equals(copy)){
            return true;
        }
        else{

            System.out.println(copy);

            System.out.println(rev);

            return false;

        } 


    }

    public static int[] problem167(){
        int[] nums = {2,7,11,15};
        int k = 9;
        int n = nums.length;
        Arrays.sort(nums);
        int left = 0;
        int right = n-1; 
        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum==k){
                return new int[] {left+1, right+1};
            }
            else if(sum<k) left++;
            else if(sum>k) right--;
        }
        

        return new int[] {};
    }

    public static List<List<Integer>> problem15(){
        int[] nums = {-1, 0, 1, 1, 2, -1, -4};
        int k = 0;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        
        for(int i = 0;i<nums.length;i++){
            int left = 0, right= n-1;
            while(left<right){
                int sum = nums[left]+nums[right]+nums[i];
                if(sum==k){
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left<right && nums[left] == nums[left+1])left++;
                    while(left<right && nums[right] == nums[right-1])right--;

                    left++;
                    right--;

                 }
                if(sum<k){
                    left++;
                }
                else if(sum>k){
                    right--;
                }

            }
        }
        return res;
    }

    public static int problem11(){
        int[] height = {1,8,6,2,5,4,8,3,7};
        int n = height.length;
        int left = 0, right = n-1;
        int maxArea = 0;
        while(left<right){
            int area = Math.min(height[left], height[right])*(right-left);
            maxArea = Math.max(maxArea, area);
            if(height[left]<height[right]) left++;
            if(height[left]>height[right]) right--;
        }

        return maxArea;
    }

    public static int problem26(){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int n = nums.length;
        int insertPos = 1;
        for(int i = 1;i<n;i++){
            if (nums.length == 0) return 0;    

            if(nums[i] != nums[i-1]){
                nums[insertPos] = nums[i];
                insertPos++;
            }   


        }

        return insertPos;
    }

    public static int problem27(){
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int n = nums.length;
        int k = 0;

        for(int i = 0; i<n;i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        

        return k;
    }

    public static int[] problem283(){
        int[] nums = {0,1,0,3,12}; // 1 1 0 3 12    1 3 0 3 12      1 3 12 3 12      
        int n = nums.length;
        int zeros = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]!=0){
                nums[zeros] = nums[i];
                zeros++;
            }
        }
        int i = 0;
        while(i<n-zeros){
            nums[n-i-1] = 0;
            i++; 
        }

        return nums;
    }

    public static int[] problem2460(){
        int[] nums = {1,2,2,1,1,0};
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }
        // 1 4 0 2 0 0
        int k = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]!=0){
                nums[k] = nums[i];  // 1 4 2 2 0 0
                k++;
            }
        }
        int i = 0;
        while(i<n-k){
            nums[n-i-1] = 0;
            i++;
        }

        return nums;
    }

    public static int[] problem977(){
        int[] nums = {-4, -1, 0, 3, 10};
        int n = nums.length;
        for(int i = 0;i<n;i++){
            nums[i] *= nums[i]; 
        }

        Arrays.sort(nums);
        return nums;
    }

}


// tmrrw: 7 am wake up          - 4 hrs
// 25 min tiger                 - 3 hrs 35 min
// 25 min new soap dispenser    - 3 hrs 10 min
// 2 hr coding class            - 1 hr 10 min
// 30 min bath                  - 40 min
// 30 min breakfast             - 0 (11 bj gaye , go to shop)