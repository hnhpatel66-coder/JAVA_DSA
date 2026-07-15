import java.util.*;

public class MisingNumber {
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //int n = arr.length;
        int sum=0;
        int total = n*(n+1)/2;

        for(int i=0; i<n ;i++){
            sum +=arr[i];
        }

        int ans =total-sum;
        System.out.println("Missing Element: "+ ans);
    }
}