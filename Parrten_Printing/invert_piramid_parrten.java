import java.util.Scanner;

public class invert_piramid_parrten {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of row: ");
        int n = sc.nextInt();

//        Enter Number of row: 5
//                * * * * * * * * *
//                  * * * * * * *
//                    * * * * *
//                       * * *
//                         *
        for(int row=1 ; row<=n ; row++){

            for(int col=1 ; col<=row-1 ; col++){
                System.out.print("  ");
            }
            for(int col=1 ; col<=(2*n-2*row+1) ; col++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}