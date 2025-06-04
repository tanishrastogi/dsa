import java.util.*;

public class date4 {
    public static void main(String[] args) {
        
        System.out.println("Enter Number of elements in the array.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Element "+i+": ");
            arr[i] = sc.nextInt();
        }

        // int[] a= problem238(arr);
        problem560(arr,5);

        // for(int i=0;i<a.length;i++){
        //     if(i==0){
        //         System.out.println("[ ");
        //         System.out.println(a[i]);
        //     }
        //     else if(i==a.length-1){
        //         System.out.println(a[i]);
        //         System.out.println("]");
        //     }
        //     else{
        //         System.out.println(a[i]);
        //     }
        // }

    }


    public static int[] problem238(int[] arr){
        // product of array except self

        int n = arr.length;

        int[] result = new int[n];
        int[] suffix = new int[n];
        int[] prefix = new int[n];
        
        prefix[0] = 1;
        suffix[n-1] = 1;
        
        for(int i = 1; i<n;i++){
            prefix[i] = prefix[i-1]*arr[i-1];
        }

        // [5 , 1 , 4 , 3]

        // suffix = [ 12,12,3,1]

        for(int i = n-2; i>=0;i--){
            suffix[i] = suffix[i+1]*arr[i+1];
        }

        for(int i =0;i<n;i++){
            result[i] = prefix[i]*suffix[i];
        }

        return result;

    }

    public static int problem560(int[] arr, int k){
        
        int n = arr.length;
        int c = 0;

        for(int i = 0;i<n; i++){
            int currentSum = 0;
            if(arr[i]==k){
                c++;
            }
            for(int j = 0;j<n;j++){
                currentSum = currentSum + arr[i];
                if(currentSum == k){
                    c++;
                }
            }            
        }

        System.out.println(c);

        return c;
    }

}