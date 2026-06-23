import java.util.Scanner;

public class Hollow_LowerTriangle_parrten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of N: ");
        int n = sc.nextInt();

//        Enter Number of N: 5
//                *
//                * *
//                *   *
//                *     *
//                * * * * *
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i==j || j==1 || i==n){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
