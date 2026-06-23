import java.util.Scanner;

public class Print_count_digit {

     static void PrintDigit(int num){

         while(num!=0){
             int rem = num%10;
             System.out.println(rem);
             num=num/10;
         }
     }

     //Digit Count
     static int Count(int num){

         int count=0;
         while(num!=0){
             int rem = num%10;
             num=num/10;
             count++;
         }
         return count;
     }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.print("Reversed number: ");
        PrintDigit(num);

        int ans = Count(num);
        System.out.print("Number of Digits: "+ans);
    }
}
