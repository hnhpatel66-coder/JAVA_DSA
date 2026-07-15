import java.util.Scanner;

public class sort_zeroOrOne {
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int low=0;
        int high=n-1;

    while(low < high){
        if(arr[low] == 1 && arr[high] == 0){
            // int temp = arr[low];
            // arr[low] = arr[high];
            // arr[high] = temp;
            arr[low]=0;
            arr[high]=1;
        }

        if(arr[low] == 0){
            low++;
        }
        if(arr[high] == 1){
            high--;
        }
    }

    for(low = 0; low<n; low++){
        System.out.print(" " + arr[low]);
    }
}
}