import java.util.Scanner;

public class numerical_triangle_parrten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Row: ");
        int n = sc.nextInt();

//        Enter Number of Row: 5
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
        for(int row=1 ; row<=n ; row++){
            for(int col=1 ; col<=row ; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
