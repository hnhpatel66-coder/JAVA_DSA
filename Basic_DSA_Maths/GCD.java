import java.util.Scanner;

public class GCD {

    static int gcd(int a,int b){
        // GCD(a,b) = GCD(b, a%b)

        while (b!=0) {
            int oldvalue = b;
            b = a % b;
            a = oldvalue;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Number 1st: ");
        int a = n.nextInt();

        System.out.print("Enter Number 2nd: ");
        int b= n.nextInt();

        int ans = gcd(a,b);
        System.out.print("GCD is: "+ ans);

    }

}
