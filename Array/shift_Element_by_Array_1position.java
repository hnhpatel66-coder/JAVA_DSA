import java.util.*;

public class shift_Element_by_Array_1position {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int temp = arr[n-1];
        for(int i = n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        System.out.print("After Shifting Element: ");
        for(int i =0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
