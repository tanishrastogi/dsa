// 26/06/2025

import java.util.Arrays;
import java.util.HashMap;

public class day7 {
    public static void main(String[] args) {
        // problem125();
        problem167();
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
}