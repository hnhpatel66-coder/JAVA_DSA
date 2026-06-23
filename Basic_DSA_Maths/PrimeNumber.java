import java.util.Scanner;


public class PrimeNumber {

    static boolean Primenumber(int n) {
        //Time Complexcity O(√n) Wost Case
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " is not PrimNumber");
                return false;
            }
        }
        // Wost Case
//        for (int i = 2; i < n; i++) {
//            if (n % i == 0) {
//                System.out.println(n + " is not PrimNumber");
//                return false;
//            }
//        }
        System.out.println(n+" is Prime Number");
        return true;
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = n.nextInt();

        boolean primnum = Primenumber(num);
        System.out.println(primnum);

    }

}
