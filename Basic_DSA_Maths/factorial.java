import java.util.Scanner;


public class factorial {

    static int Factorial(int n) {
        if(n==0 || n==1) {return 1;}

        int fac= (n * Factorial(n-1));
        return fac;
    }

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = n.nextInt();

        int Factorial = Factorial(num);
        System.out.println("Factorial of "+num +"is: " + Factorial);

    }

}
