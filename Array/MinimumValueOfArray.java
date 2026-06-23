import java.util.Scanner;

public class MinimumValueOfArray {

    public static void main(String[]args){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        int number = n.nextInt();
        int arr[] = new int[number];


        for(int i=0 ; i<number ; i++){
            arr[i] = n.nextInt();
        }

        System.out.println();

        System.out.print("Your Array is: ");
        for(int value:arr){
            System.out.print(value+" ");
        }

        System.out.println();
        System.out.print("Minimum Number of elements in the array : ");
        int min = arr[0];

        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
