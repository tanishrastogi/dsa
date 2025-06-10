package misc;

import java.util.Scanner;

public class prob1 {

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

        problem1(arr, k);

    }

    public static boolean problem1(int[] nums, int k) {
        int n = nums.length;

        // First attempt: Make all 1s
        int[] copy1 = nums.clone(); // Work on a clone
        int transitions1 = 0;
        for (int i = 0; i < n - 1; i++) {
            if (copy1[i] == -1) {
                copy1[i] = 1;
                copy1[i + 1] = 1;
                transitions1++;
            }
        }
        boolean allOnes = true;
        for (int num : copy1) {
            if (num != 1) {
                allOnes = false;
                break;
            }
        }

        if (allOnes && transitions1 <= k) {
            return true;
        }

        // Second attempt: Make all -1s
        int[] copy2 = nums.clone();
        int transitions2 = 0;
        for (int i = 0; i < n - 1; i++) {
            if (copy2[i] == 1) {
                copy2[i] = -1;
                copy2[i + 1] = -1;
                transitions2++;
            }
        }

        boolean allNegOnes = true;
        for (int num : copy2) {
            if (num != -1) {
                allNegOnes = false;
                break;
            }
        }
        System.out.println(allNegOnes && transitions2 <= k);
        return allNegOnes && transitions2 <= k;
    }
}



/*
 * Q1. Transform Array to All Equal Elements
Medium
4 pt.
You are given an integer array nums of size n containing only 1 and -1, and an integer k.

You can perform the following operation at most k times:

Choose an index i (0 <= i < n - 1), and multiply both nums[i] and nums[i + 1] by -1.

Note that you can choose the same index i more than once in different operations.

Return true if it is possible to make all elements of the array equal after at most k operations, and false otherwise.

 

Example 1:

Input: nums = [1,-1,1,-1,1], k = 3

Output: true

Explanation:

We can make all elements in the array equal in 2 operations as follows:

Choose index i = 1, and multiply both nums[1] and nums[2] by -1. Now nums = [1,1,-1,-1,1].
Choose index i = 2, and multiply both nums[2] and nums[3] by -1. Now nums = [1,1,1,1,1].
Example 2:

Input: nums = [-1,-1,-1,1,1,1], k = 5

Output: false

Explanation:

It is not possible to make all array elements equal in at most 5 operations.

 
 */
