import java.util.Scanner;

public class triangle {

    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of N: ");
        int n = sc.nextInt();

        // lower triangle logic
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }

        // uper triangle logic
//        Enter Number of N: 5
//                * * * * *
//                * * * *
//                * * *
//                * *
//                *

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

