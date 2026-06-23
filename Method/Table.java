import java.util.Scanner;

public class Table {

    // Method Declaration / Defination
    static void Table(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = input.nextInt();

        System.out.println("Table: ");
        for(int i = 1; i <= 10; i++){
            System.out.println( i*number+" ");
        }
    }
    public static void main() {

        Table();
    }
}
