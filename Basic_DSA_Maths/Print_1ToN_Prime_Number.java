import java.util.Scanner;

public class Print_1ToN_Prime_Number {
    static boolean isPrimenumber(int n) {
        //Time Complexcity O(√n) Wost Case
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    static void PrintallPrimeNumber(int n) {
        for (int i = 2; i <= n; i++) {
            boolean isPrim = isPrimenumber(i);
            if (isPrim == true) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=input.nextInt();

        System.out.println("Prime Number of 1 to "+ n +" :");
        PrintallPrimeNumber(n);
    }
}
