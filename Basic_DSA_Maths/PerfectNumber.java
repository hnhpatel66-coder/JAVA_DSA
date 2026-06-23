import java.util.Scanner;


public class PerfectNumber {

    static int Perfect(int n) {
        int sum=1;

        for(int i=2 ; i<n ; i++) {
            if(n%i==0) {
                sum+=i;
            }
        }
      return sum;
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = n.nextInt();

       if(num==Perfect(num)) {
           System.out.println(num + " is Perfect Number");
       }
        else{
            System.out.println(num + " is not Perfect Number");
       }

    }

}
