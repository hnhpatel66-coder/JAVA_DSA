import java.util.Scanner;

public class ReversDigit_Palidrom {

    static int ReversDigits(int num){
        int reversnum=0;
        while(num!=0){
            int digit=num%10;
            reversnum = reversnum*10 + digit;
            num=num/10;
        }
        return reversnum;
    }

    static boolean Pelidrom(int num){
        int original=num;
        int reversnum=ReversDigits(num);

        if(original==reversnum){
            System.out.println("It is Pelidrom");
            return true;
        }
        else{
            System.out.println("It is not Pelidrom");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int ans = ReversDigits(num);
        System.out.println("Rever Digit is " + ans);

        boolean palindrom = Pelidrom(num);
        System.out.println(palindrom);
    }
}
