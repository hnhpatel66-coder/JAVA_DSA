import java.util.Scanner;

public class triangle3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Row: ");
        int n = sc.nextInt();

//        Enter Number of Row: 5
//                1
//              1 2 1
//            1 2 3 2 1
//          1 2 3 4 3 2 1
//        1 2 3 4 5 4 3 2 1

        for(int row=1;row<=n;row++){
            // part 1
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            // part 2
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            // part 3
            int rowvalue=row;
            int decrimentrowvalue=row-1;
            for(int col=1;col<=row-1;col++){
                System.out.print(decrimentrowvalue+" ");
                decrimentrowvalue--;
            }
            System.out.println();
        }

    }
}
