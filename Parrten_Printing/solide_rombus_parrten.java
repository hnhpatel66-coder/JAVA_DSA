import java.util.Scanner;

public class solide_rombus_parrten {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Row: ");
        int n=input.nextInt();

//        Enter the number of Row: 5
//                    * * * * *
//                   * * * * *
//                  * * * * *
//                 * * * * *
//                * * * * *
        for(int row=1 ; row<=n ; row++){
            for(int col=1 ; col<=n-row ; col++){
                System.out.print("  ");
            }
            for(int col=1 ; col<=n ; col++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
