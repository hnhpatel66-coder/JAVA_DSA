
import java.util.Scanner;

public class LCM {

    static int gcd(int a,int b){
        // GCD(a,b) = GCD(b, a%b)

        while (b!=0) {
            int oldvalue = b;
            b = a % b;
            a = oldvalue;
        }
        return a;
    }

    static int lcm(int a,int b){
        int gcd=gcd(a,b);
        int product=a*b;
        return (product/gcd);
    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Number 1st: ");
        int a = n.nextInt();

        System.out.print("Enter Number 2nd: ");
        int b= n.nextInt();

        int Gcd = gcd(a,b);
        System.out.println("GCD is: "+ Gcd);

        int Lcm = lcm(a,b);
        System.out.println("LCM is: "+ Lcm);

    }

}
