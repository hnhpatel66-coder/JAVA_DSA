import java.util.Scanner;

public class triangle5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Row: ");
        int n = sc.nextInt();

//        Enter Number of Row: 5
//                A
//              A B A
//            A B C B A
//          A B C D C B A
//        A B C D E D C B A


        for(int row=1;row<=n;row++){
            // part 1
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            // part 2
            for(int col=1;col<=row;col++){
                int a=col;
                int c='A'-1;
                char ans=(char)(a+c);
                System.out.print(ans+" ");
                a++;
            }
            // part 3
            char toprint = (char)(row+'A' - 2);
            for(int col=1;col<=row-1;col++){
                System.out.print(toprint+" ");
                toprint--;
            }
            System.out.println();
        }

    }
}
