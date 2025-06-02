import java.util.*;
public class date1{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in array.");
        int n = sc.nextInt();
        int arr[] = new int[n]; 

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        problem121(arr);

    }

    public static void problem121(int arr[]){

        // problem 121 : leetcode.
        //  best time to buy and sell a stock.

        //eg arr = [7, 1, 5, 3, 6, 4]
        
        int minPrice = arr[0];
        int maxProfit = 0;
        int i = 1;
        while(i<arr.length){
            if(arr[i]<minPrice){
                minPrice = arr[i];
            }
            if(arr[i]-minPrice>maxProfit){
                maxProfit = arr[i]-minPrice;
            }
        }

        
    }
}