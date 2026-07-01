import java.util.Collections;
import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedList_2 {
    public static void main(String[] args) {
        // Create a List of integers
        LinkedList<Integer> list = new LinkedList<>();
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
        list.add(55);
        // Contains
        System.out.println("List contains 33: " + list.contains(33));

        // Sort an ArrayList (Ascending Order)
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // Sort an ArrayList (Descending Order)
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted List in Descending Order: " + list);

        // ArrayList<Integer> newlist =  (ArrayList<Integer>)list.clone();
        // System.out.println("Cloned List: " + newlist);

        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(101);

        System.out.println(marks.isEmpty());
        System.out.println("index of the element: " + list.indexOf(33));

        System.out.println("Last index of the element: " + list.lastIndexOf(33));

        // addFirst and addLast methods are not available in ArrayList, they are available in LinkedList
        System.out.println("List: " + list);
        list.addFirst(1);
        list.addLast(1000);
        System.out.println("List after adding first and last: " + list);

        list.remove(4);
        System.out.println("List after removing element at index 4: " + list);

        list.removeFirst();
        list.removeLast();
        System.out.println("List after removing first and last: " + list);

        System.out.println("First element: " + list.peekFirst());
        System.out.println("Last element: " + list.peekLast());

        list.poll();
        System.out.println("After Poling List: "+ list);
    }
}