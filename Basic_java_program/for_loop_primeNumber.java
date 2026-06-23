import java.util.Scanner;


public class for_loop_primeNumber {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = n.nextInt();

        int count = 0,i;

        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }

        }
        if(count==2){
            System.out.println(num +" is Prime Number");
        }
        else{
            System.out.println(num +" is not Prime Number");
        }

    }

}
