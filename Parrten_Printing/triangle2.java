import java.util.Scanner;

public class triangle2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Number of N: ");
            int n = sc.nextInt();


            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= row; col++) {
                    int a = n-col;
                    int b = 'A';
                    int c=a+b;
                    char ch = (char)c;
                    System.out.print(ch+" ");
                }
                System.out.println();
            }
        }


}
