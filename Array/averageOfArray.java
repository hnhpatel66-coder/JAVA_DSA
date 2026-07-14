import java.util.Scanner;

public class averageOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int number = sc.nextInt();
        int arr[] = new int[number];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }

        double sum = 0;
        for(int i: arr){
            sum +=arr[i];
        }

        double average = sum / number;
        System.out.println("The average of the array is: " + average);
    }
}
