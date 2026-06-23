import java.util.Scanner;

public class Number_ABCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of N: ");
        int n = sc.nextInt();

//        Enter Number of N: 5
//        1
//        A B
//        1 2 3
//        A B C D
//        1 2 3 4 5
        for (int i = 1; i <= n; i++) {
            int a=1;
            if (i % 2 == 0) {
                for (int j = 1; j <= i; j++) {
                    int d = 64 + a;
                    char ch = (char) d;
                    System.out.print(ch +" ");
                    a++;
                }
            }
            else if(i%2!=0){
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
