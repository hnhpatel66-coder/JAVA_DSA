import java.util.Scanner;

public class multiplayby10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        
        int number = sc.nextInt();
        int arr[] = new int[number];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array after multiplying each element by 10:");
        for (int i = 0; i < number; i++) {
            arr[i] *= 10;
            System.out.print(arr[i] + " ");
        }
    }
}
