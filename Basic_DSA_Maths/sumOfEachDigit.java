import java.util.Scanner;

public class sumOfEachDigit  {

    static int SumOfDigits(int num){
        int sum=0;
        while(num!=0){
            int rem = num%10;
            sum+=rem;
            num=num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int sum = SumOfDigits(num);
        System.out.print("Sum of Each Digits is : " + sum);

    }
}
