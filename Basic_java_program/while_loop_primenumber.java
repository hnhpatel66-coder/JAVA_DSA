import java.util.Scanner;

public class while_loop_primenumber {
    public static void main() {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = n.nextInt();

        int count = 0,i=1;

        while(i<=num) {
            if(num%i==0) {
                count++;
            }
            i++;
        }
        if(count==2){
            System.out.println(num +" is Prime Number");
        }
        else{
            System.out.println(num +" is not Prime Number");
        }
    }
}
