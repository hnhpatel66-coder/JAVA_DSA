import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_1 {
    public static void main(String[] args) {
    // Create a List of integers
    // ArrayList(InterFace) -> Concreate Class
    LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("List: " + list);
        list.add(1, 15); // Add element at index 1
        System.out.println("List after adding 15 at index 1: " + list);

        list.remove(2);
        System.out.println("List after removing element at index 2: " + list);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(100);
        list2.add(200);
        list2.add(20);
        list.addAll(list2);
        System.out.println("List after adding all elements from list2: " + list);

        list.removeAll(list2);
        System.out.println("List after removing all elements from list2: " + list);

        System.out.println("Size of the list: " + list.size());

        System.out.println("Printing List2: " + list2);
        list2.clear();
        System.out.println("Printing List2 after clearing: " + list2.size());
    }
}