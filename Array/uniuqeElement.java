import java.util.*;

public class uniuqeElement {
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int xorsum=0;
        for(int i=0; i<n; i++){
            xorsum = xorsum ^ arr[i];
        }

        System.out.print("Uniuqe Element is: "+ xorsum);
    }
}
