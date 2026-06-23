import java.util.Scanner;

public class PrimeNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i=2; i<=num ; i++){
            int count = 0;
            for(int j=1 ; j<=num ; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2 ) {
                sum += i;
            }
        }
        System.out.println("Sum of Prime Number: " + sum);
    }
}
