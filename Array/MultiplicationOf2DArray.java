import java.util.Scanner;

public class MultiplicationOf2DArray {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = n.nextInt();

        System.out.print("Enter the number of columns: ");
        int col = n.nextInt();

        int arr[][] = new int[row][col];

        System.out.println("Enter the elements of the 2D array: ");
        for(int rowindex=0 ; rowindex<row ; rowindex++){
            for(int  colindex=0 ; colindex<col ; colindex++){
                arr[rowindex][colindex] =  n.nextInt();
            }
        }

        int mul=1;
        System.out.print("The Multiplication of 2D array in Each Element is : ");
        for(int rowindex=0 ; rowindex<row ; rowindex++){
            for(int colindex=0 ; colindex<col ; colindex++){
                mul*=arr[rowindex][colindex];
            }
        }
        System.out.println(mul);
    }
}
