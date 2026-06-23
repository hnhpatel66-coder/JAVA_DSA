import java.util.Scanner;

public class Input_Output {

     void main() {

         // For Integer Value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int firstnum = sc.nextInt();

         System.out.println("Enter 2nd Number: ");
         int secondnum = sc.nextInt();

         int sum = firstnum + secondnum;
         System.out.println("The sum is: " + sum);

         int multiply = firstnum * secondnum;
         System.out.println("The multiply is: " + multiply);

         int mod = firstnum % secondnum;
         System.out.println("The mod is: " + mod);

         int div = firstnum / secondnum;
         System.out.println("The div is: " + div);

         // For Float Value

         System.out.println("Enter 1st Number: ");
         float firstn = sc.nextFloat();

         System.out.println("Enter 2nd Number: ");
         float secondn = sc.nextFloat();

         float sum1 = firstnum + secondnum;
         System.out.println("The sum is: " + sum1);

         float multiply1 = firstnum * secondnum;
         System.out.println("The multiply is: " + multiply1);

         float mod1 = firstn % secondn;
         System.out.println("The mod is: " + mod1);

         float div1 = firstn / secondn;
         System.out.println("The div is: " + div1);
    }
}