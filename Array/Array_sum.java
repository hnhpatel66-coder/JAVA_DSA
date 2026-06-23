import java.util.Scanner;

public class Array_sum {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.print("Enter the number of elements you want in the array: ");
        int number = n.nextInt();
        int arr[] = new int[number];
        int sum=0;

        for(int i=0 ; i<number ; i++){
            arr[i] = n.nextInt();
        }

        System.out.print("Your Array is : ");
        for(int i:arr){
           System.out.print(i+" ");
        }

        System.out.println();

        System.out.print("The sum is ");
        for(int i:arr){
            sum+=i;
        }
        System.out.print(sum);

    }
}
