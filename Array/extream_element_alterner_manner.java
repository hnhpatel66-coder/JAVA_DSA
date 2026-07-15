import java.util.*;

public class extream_element_alterner_manner {
   public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int i=0 , j=n-1;
        // for (i = 0; i < n-1; i++) {
        //     if(i<=j){
        //         int temp = arr[i];
        //         arr[i] = arr[j];
        //         arr[j]=temp;
        //         j--;
        //     }
        // }
        while(i<=j){
            int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
                i++;
                j--;
        }
        
        System.out.println("Revers Array is ");
        for (i = 0; i < n; i++) {
           System.out.print(arr[i]+" ");
        }
    }
}
