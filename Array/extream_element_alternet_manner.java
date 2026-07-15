import java.util.*;

public class extream_element_alternet_manner {
   public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int left=0 , right=n-1;

        System.out.println("Extream Element in alternate manner: ");
        while(left<=right){
            if(left == right){
                System.out.print(arr[left]);
                return;
            }

            else{
                System.out.print(arr[left]);
                left++;
                System.out.print(" " + arr[right]+ " ");
                right--;
            }
        }
        
    }
}