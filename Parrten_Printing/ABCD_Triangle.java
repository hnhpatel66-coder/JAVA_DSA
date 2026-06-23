import java.util.Scanner;

public class ABCD_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of N: ");
        int n = sc.nextInt();

//        Enter Number of N: 5
//        A
//        A B
//        A B C
//        A B C D
//        A B C D E
        //int a = 1;
        for (int i = 1; i <= n; i++) {
            int a = 1;
            for (int j = 1; j <= i; j++) {
                int d = a+64;
                char ch = (char)d;
                System.out.print(ch+" ");
                a++;
            }
            System.out.println();
        }
    }
}
