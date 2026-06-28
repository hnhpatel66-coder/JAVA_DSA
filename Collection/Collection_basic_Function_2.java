import java.util.ArrayList;

public class Collection_basic_Function_2 {
    public static void main(String[] args) {
        // Create a List of integers
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Before Set List: " + list);

        list.set(2, 33);
        System.out.println("After Set List: " + list);


        // ToArray
        Object[] arr = list.toArray();
        for(Object obj : arr){
            System.out.print(obj + " ");
        }

        // Contains
        System.out.println("List contains 20: " + list.contains(20));
    }
}
