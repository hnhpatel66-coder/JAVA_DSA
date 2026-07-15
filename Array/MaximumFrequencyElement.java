import java.util.*;

public class MaximumFrequencyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxFreq = 0;
        int maxElement = arr[0];

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxFreq) {
                maxFreq = count;
                maxElement = arr[i];
            }
        }

        System.out.println("Maximum Frequency Element = " + maxElement);
        System.out.println("Frequency = " + maxFreq);
    }
}


// import java.util.*;



// public class modOfArray {

//     static int GetMod(int arr[]){
//         HashMap<Integer, Integer> freq = new HashMap<>();

//         for(int num: arr){
//             freq.put(num, freq.getOrDefault(num, 0) + 1);
//         }

//         for(int i: freq.keySet()){
//             System.out.println(i + " -> "+ freq.get(i));
//         }

//         int maxFreq = -1;
//         int maxFreqWaliKey = -1;

//         for (int key : freq.keySet()) {
//             int currentKey = key;
//             int currentKeyKiFrequency = freq.get(key);

//             if (currentKeyKiFrequency > maxFreq) {
//                 // mujhe naya max mil gya
//                 maxFreq = currentKeyKiFrequency;
//                 maxFreqWaliKey = currentKey;
//             }
//         }
        
//         return maxFreqWaliKey;
//     }
//     public static void main(){

//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the size of the array: ");
//         int n = scanner.nextInt();
        
//         int[] arr = new int[n];
//         System.out.println("Enter the elements of the array:");

//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         int ans = GetMod(arr);
//         System.out.print("Max Freqwantli Key: " + ans);
//     }
// }