import java.util.Scanner;

public class String3_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string(NextLine): ");
        String str1 = sc.nextLine();
        System.out.println("String: "+ str1);

        System.out.print("Enter a string(Next): ");
        String str2 = sc.next();
        System.out.println("String: "+ str2);

        // str1 = str1.trim(); => Space remove
    }
}
