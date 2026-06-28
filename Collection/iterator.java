import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        System.out.println("List: " + list);

        // Using Iterator to traverse the list
       Iterator<Integer> iterator = list.iterator();

       while(iterator.hasNext()){
        System.out.println("Element: " + iterator.next());
       }
    }
}
