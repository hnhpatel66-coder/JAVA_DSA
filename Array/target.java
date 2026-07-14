import java.util.*;
import java.util.Scanner;

public class target {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
               System.out.println("Target value found at index: " + i);
                return;
            }
        }
        System.out.println("Target value not found in the array.");
    }
}
