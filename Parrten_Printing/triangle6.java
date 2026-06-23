import java.util.Scanner;

public class triangle6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Row: ");
        int n = sc.nextInt();

//        Enter Number of Row: 5
//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

        for(int row=1 ; row<=n ; row++){
            for(int col=1 ; col<=row ; col++){
                if(row == col || (row+col)%2==0){
                    System.out.print(" 1");
                }
                else{
                    System.out.print(" 0");
                }
            }
            System.out.println();
        }
    }
}
