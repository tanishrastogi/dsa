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

        problem238(arr);

    }


    public static int[] problem238(int[] arr){
        // product of array except self

        int[] result = new int[arr.length];
        // int totalProducts = 1;
        // // for(int i = 0;i<arr.length;i++){
        // //     result[i] *=
        // // }
        
        // for(int num:arr){
        //     totalProducts *= num ;
        //     // System.out.println(totalProducts);
        // }

        // for(int i = 0;i<arr.length;i++){
        //     result[i] = totalProducts/arr[i];
        //     System.out.println(result[i]);

        // }

        result[0] = 1;

        for(int i = 0;i<arr.length;i++){
            // result[i] = result[i-1]*nu
        }

        return result;

    }

}