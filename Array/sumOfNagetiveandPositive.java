import java.util.*;

public class sumOfNagetiveandPositive {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int psum=0;
        int nsum=0;

        for(int i=0; i<n; i++){
            if(arr[i]<0){
                nsum +=arr[i];
            }
            else{
                psum +=arr[i];
            }
        }

        System.out.println("The Sum of Positive Number is "+ psum);
        System.out.println("The Sum of Positive Number is "+ nsum);
    }
}
