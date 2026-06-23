import java.util.Scanner;

public class String5_CHarecterArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string(NextLine): ");
        String str1 = sc.nextLine();
        System.out.print("String(NextLine): "+str1);
        char str2[] = str1.toCharArray();

        for(char ch:str2){
            System.out.println("Value of Charecter: "+ch);
        }
    }
}
