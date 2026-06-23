import java.util.Scanner;

public class String8_Plidrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("String: "+ str);

        String Revers = "";
        for(int i=str.length()-1 ; i>=0 ; i--){
            Revers += str.charAt(i);
        }

        System.out.println("Reversed String: "+ Revers);

        if(Revers.equals(str)){
            System.out.println(str+" is Palidrom");
        }
        else{
            System.out.println(str+" is not Palidrom");
        }
    }
}
