import java.util.Scanner;

public class solid_daymond_parrten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Row: ");
        int n = sc.nextInt();

//        Enter Number of Row: 5
//                        *
//                      * * *
//                    * * * * *
//                  * * * * * * *
//                * * * * * * * * *
//                  * * * * * * *
//                    * * * * *
//                      * * *
//                        *

        // uper peramid
        for(int row=1 ; row<=n ; row++){
            // for spae
            for(int col=1 ; col<=n-row ; col++){
                System.out.print("  ");
            }
            // for piramide
            for(int col=1 ; col<=2*row-1 ; col++){
                System.out.print(" *");
            }
            System.out.println();
        }

        // lower piramid
        for(int row=1 ; row<=n ; row++){

            if(row==1){
                continue;
            }
            for(int col=1 ; col<=row-1 ; col++){
                System.out.print("  ");
            }

            for(int col=1 ; col<=2*n-2*row+1 ; col++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
