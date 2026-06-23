import java.util.Scanner;

public class MaximumNumberOfArray {

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
        System.out.print("Maximum Number of elements in the array : ");
        int max = arr[0];

        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
