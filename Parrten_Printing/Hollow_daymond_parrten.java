import java.util.Scanner;

public class Hollow_daymond_parrten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Row: ");
        int n = sc.nextInt();
//
//        Enter Number of Row: 5
//                        *
//                      *   *
//                    *       *
//                  *           *
//                *               *
//                  *           *
//                    *       *
//                      *   *
//                        *

        for(int row=1 ; row<=n ; row++){
            // part1 space
            for(int col=1 ; col<=n-row ; col++){
                System.out.print("  ");
            }

            // part 2
            if(row == 1) {
                for (int col =1; col<=2*row-1 ; col++){
                    System.out.print(" *");
                }
            }
            else{
                // medal row
                // 1 *
                System.out.print(" *");
                // 2row - 3 space
                for(int col=1; col<=2*row-3 ; col++){
                    System.out.print("  ");
                }
                // 1 *
                System.out.print(" *");

            }
            System.out.println();
        }

        for(int row=1 ; row<=n-1 ; row++){

            for(int col=1 ; col<=row ; col++){
                System.out.print("  ");
            }
            if(row == (n-1)) {
                System.out.print(" *");
            }
            else{
                System.out.print(" *");
                for (int col = 1; col <= 2 * (n - row) - 3; col++) {
                    System.out.print("  ");
                }
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
