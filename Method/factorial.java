import java.util.Scanner;

public class factorial {
    static int Factorial(int n) {
        if(n==0 || n==1) return 1;

        return (n*Factorial(n-1));
    }
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = n.nextInt();

        for(int i=0; i<=num; i++){
            System.out.println("Factorial of "+i+" is "+Factorial(i));
        }
    }
}
