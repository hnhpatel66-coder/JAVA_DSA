import java.util.Scanner;

public class do_while_loop {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0, i=1;
        do{
            if(num%i==0) {
                count++;
            }
            i++;
        }while(i<=num);
        if(count==2){
            System.out.println(num +" is Prime Number");
        }
        else{
            System.out.println(num +" is not Prime Number");
        }
    }
}
