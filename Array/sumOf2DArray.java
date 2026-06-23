import java.util.Scanner;

public class sumOf2DArray {
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

        int sum=0;
        System.out.print("The Sum of 2D array in Each Element is : ");
        for(int rowindex=0 ; rowindex<row ; rowindex++){
            for(int colindex=0 ; colindex<col ; colindex++){
                sum+=arr[rowindex][colindex];
            }
        }
        System.out.println(sum);
    }
}
