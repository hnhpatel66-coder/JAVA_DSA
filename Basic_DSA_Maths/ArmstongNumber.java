import java.util.Scanner;


public class ArmstongNumber {

    static boolean Armstong(int n) {
      int sum=0;
      int original = n;
        while(n!=0) {
            int digit=n%10;
            int cubeofdigit = digit*digit*digit;
            sum = sum+cubeofdigit;
            n=n/10;
        }
        if(sum==original) {
            System.out.println("It Armstong Number");
            return true;
        }
        else {
            System.out.println("It Not Armstong Number");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = n.nextInt();

        boolean result = Armstong(num);
        System.out.println(result);

    }

}
