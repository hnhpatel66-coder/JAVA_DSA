import java.util.*;

public class unsorted_elementOfArray {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            
            if(arr[i] > arr[i+1]){
                System.out.println("Unshorted Element in Array: " + arr[i+1]);
            }
        }
        
    }
}
