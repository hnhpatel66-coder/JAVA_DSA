import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string(NextLine): ");
        String str1 = sc.nextLine();

        System.out.println("String: "+ str1.toUpperCase());
        System.out.println("String: "+ str1.toLowerCase());

        // str1 = str1.trim(); => Space remove
    }
}

