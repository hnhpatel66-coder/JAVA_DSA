import java.util.Scanner;

public class halllo_rectengle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of ROW: ");
        int r = sc.nextInt();

        System.out.print("Enter Number of COLUMN: ");
        int c = sc.nextInt();

//        Enter Number of ROW: 5
//        Enter Number of COLUMN: 7
//                * * * * * * *
//                *           *
//                *           *
//                *           *
//                * * * * * * *
        for(int i=1 ; i<=r ; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || j == 1 || i==r || j==c) {
                System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            }
        }
}
