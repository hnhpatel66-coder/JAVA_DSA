import java.util.Scanner;

public class triangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Row: ");
        int n = sc.nextInt();

//        Enter Number of Row: 5
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
        int count=1;
        for(int row=1 ; row<=n ; row++){
            for(int col=1 ; col<=row ; col++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
