import java.util.Scanner;

public class rectengal_parrten {

    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Row: ");
        int r = sc.nextInt();

        System.out.print("Enter Number of Colan: ");
        int c = sc.nextInt();

//        Enter Number of Row: 3
//        Enter Number of Colan: 5
//                * * * * *
//                * * * * *
//                * * * * *
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
