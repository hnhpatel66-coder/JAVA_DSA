import java.util.ArrayList;
import java.util.Collections;

public class Collection_basic_Function_2 {
    public static void main(String[] args) {
        // Create a List of integers
        ArrayList<Integer> list = new ArrayList<>();
        list.add(99);
        list.add(33);
        list.add(111);
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Before Set List: " + list);

        list.set(2, 33);
        System.out.println("After Set List: " + list);


        // ToArray
        Object[] arr = list.toArray();
        for(Object obj : arr){
            System.out.print(obj + " ");
        }

        list.add(22);
        list.add(33);
        // Contains
        System.out.println("List contains 33: " + list.contains(33));

        // Sort an ArrayList
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
    }
}
