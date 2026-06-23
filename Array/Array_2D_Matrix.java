import java.util.Scanner;

public class Array_2D_Matrix {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print("Enter the number 2D Array od Row: ");
        int row=n.nextInt();

        System.out.print("Enter the number 2D Array od Colan: ");
        int colan=n.nextInt();

        int arr[][] = new int[row][colan];

        System.out.println("Enter the 2D Array : ");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<colan ; j++){
                arr[i][j]=n.nextInt();
            }
        }

        int rowlength = arr.length;
        //int collength = arr[0].length;

        System.out.println();
        System.out.println("2D Array : ");
        for(int rowindex=0 ; rowindex<arr.length ; rowindex++){

            int collength = arr[rowindex].length;
            for(int colanindex=0 ; colanindex<arr[0].length ; colanindex++){
               System.out.print(arr[rowindex][colanindex]+"| ");
            }
            System.out.println();
        }
    }
}
