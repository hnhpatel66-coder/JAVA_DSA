import java .util.*;

public class DuplicateElement {
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Duplicate Element: ");
        for(int i=0; i<n-1; i++){
            int c=0;
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    c++;
                    if(c==1){
                   System.out.print(arr[i]+" ");
                    }
                }
            }
        }

        
    }
}
