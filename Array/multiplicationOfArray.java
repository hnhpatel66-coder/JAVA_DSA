import java.util.Scanner;

public class multiplicationOfArray {

        public static void main(String[] args) {

            Scanner n = new Scanner(System.in);
            System.out.print("Enter the number of elements you want in the array: ");
            int number = n.nextInt();
            int arr[] = new int[number];
            int mul=1;

            for(int i=0 ; i<number ; i++){
                arr[i] = n.nextInt();
            }

            System.out.print("Your Array is : ");
            for(int i:arr){
                System.out.print(i+" ");
            }

            System.out.println();

            System.out.print("The Multiplication of Array is ");
            for(int i:arr){
                mul*=i;
            }
            System.out.print(mul);

        }

}
