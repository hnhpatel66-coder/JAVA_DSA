import java.util.Scanner;

public class String6_Wovels_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("String: "+ str);

        int Count = 0;
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(ch=='A' || ch=='a' || ch=='E' || ch=='e' ||
                    ch=='I' || ch=='i' || ch=='O' || ch=='o'
                            || ch=='U' || ch=='u') {
                Count++;
                System.out.println("Wovels is "+ ch);
            }
        }
        System.out.println("Number of Wovels is "+ Count);
    }
}
