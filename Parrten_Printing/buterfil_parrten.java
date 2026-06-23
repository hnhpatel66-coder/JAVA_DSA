import java.util.Scanner;

public class buterfil_parrten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Row: ");
        int n = sc.nextInt();

//        Enter Number of Row: 5
//                *                 *
//                * *             * *
//                * * *         * * *
//                * * * *     * * * *
//                * * * * * * * * * *
//                * * * * * * * * * *
//                * * * *     * * * *
//                * * *         * * *
//                * *             * *
//                *                 *

        // part 1 simetricl half
        for(int row=1 ; row<=n ; row++){
            // part 1
            for(int col=1 ; col<=row ; col++){
                System.out.print(" *");
            }
            // part 2
            for(int col=1 ; col<=2*(n-row) ; col++){
                System.out.print("  ");
            }
            // part 3
            for(int col=1 ; col<=row ; col++){
                System.out.print(" *");
            }
            System.out.println();
        }

        // part 2 => invert simetrical half
        for(int row=n ; row>=1 ; row--){
            // part 1
//            if(row==n){
//                continue;
//            }
            for(int col=1 ; col<=row ; col++){
                System.out.print(" *");
            }
            // part 2
            for(int col=1 ; col<=2*(n-row) ; col++){
                System.out.print("  ");
            }
            // part 3
            for(int col=1 ; col<=row ; col++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
