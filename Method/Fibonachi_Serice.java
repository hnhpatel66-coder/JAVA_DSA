import java.util.Scanner;

public class Fibonachi_Serice {

    static int Fibonachi(int n){
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 0;
        }

        return (Fibonachi(n-1) + Fibonachi(n-2));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        // System.out.println("Fibonachi of "+ n +" is "+Fibonachi(n));
        for(int i = 0; i < n; i++){
            System.out.print(Fibonachi(i)+" ");
        }

    }
}
