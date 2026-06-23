import java.util.Scanner;

public class triangle4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Row: ");
        int n = sc.nextInt();

//        Enter Number of Row: 5
//                1
//              2 2 2
//            3 3 3 3 3
//          4 4 4 4 4 4 4
//        5 5 5 5 5 5 5 5 5

        for(int row=1;row<=n;row++){
            // part 1
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            // part 2
            for(int col=1;col<=row;col++){
                System.out.print(row+" ");
            }
            // part 3
            // int rowvalue=row;
            // int decrimentrowvalue=row-1;
            for(int col=1;col<=row-1;col++){
                System.out.print(row+" ");
               //  decrimentrowvalue--;
            }
            System.out.println();
        }

    }
}
