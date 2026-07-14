import java.util.*;

public class CountOneOrZero {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int onecount=0;
        int zerocount=0;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                zerocount++;
            }
            else if(arr[i]==1){
                onecount++;
            }
            else{}
        }
        System.out.println("The Number of ONE is "+ onecount);
        System.out.println("The Number of ZERO is "+ zerocount);
    }
}
