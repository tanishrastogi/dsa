
import java.util.*;

public class date4 {

    public static void main(String[] args) {

        System.out.println("Enter Number of elements in the array.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // int[] a= problem238(arr);
        // problem560(arr,0);
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        problem974(arr, k);

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
        sc.close();
    }

    public static int[] problem238(int[] arr) {
        // product of array except self

        int n = arr.length;

        int[] result = new int[n];
        int[] suffix = new int[n];
        int[] prefix = new int[n];

        prefix[0] = 1;
        suffix[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * arr[i - 1];
        }

        // [5 , 1 , 4 , 3]
        // suffix = [ 12,12,3,1]
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * arr[i + 1];
        }

        for (int i = 0; i < n; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return result;

    }

    public static int problem560(int[] arr, int k) {

        int n = arr.length;
        int c = 0;
        int ps = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1); // base case because prefixSum is 0 once.

        for (int i = 0; i < n; i++) {
            ps += arr[i];
            if (map.containsKey(ps - k)) {
                c += map.get(ps - k);
            }

            map.put(ps, map.getOrDefault(ps, 0) + 1);

        }

        System.out.println(c);

        return c;
    }

    public static int problem974(int[] arr, int k) {

        // key concept : if remainder of 2 prefix sums are same then it would be divisible by k

        int n = arr.length;
        int c = 0;

        // int prefix_sum = 0;
        int[] prefix_sum = new int[n];
        int[] mod_array = new int[n];

        HashMap <Integer, Integer> map = new HashMap<>();

        prefix_sum[0] = arr[0];
        
        map.put(0,1);
        mod_array[0] = ((prefix_sum[0]%k)+k)%k;
        for(int i = 1 ; i<n;i++){
            prefix_sum[i]= prefix_sum[i-1]+arr[i];
            mod_array[i] = ((prefix_sum[i]%k)+k)%k;
            // map.put(mod_array[i], 1);
        }

        for(int j = 0;j<n;j++){
            if(map.containsKey(mod_array[j])){
                c+=map.get(mod_array[j]);
            }
            map.put(mod_array[j], map.getOrDefault(mod_array[j], 0)+1);
            
        }
        
        System.out.println(c);

        return 0;
    }

}
