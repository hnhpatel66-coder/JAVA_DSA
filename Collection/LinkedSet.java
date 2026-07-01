import java.util.*;

public class LinkedSet {
    public static void main(String[] args) {
      
        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        set1.retainAll(set2); // retainAll => retains only the elements in this set that are contained in the specified collection
        System.out.println("Intersection of set1 and set2: " + set1);

        System.out.println("Set1 Present in Set2: " + set1.containsAll(set2)); 
        System.out.println("Set2 Present in Set1: " + set2.containsAll(set1));

        Set<Integer> set = new LinkedHashSet<>();
        set.add(11);
        set.add(22);
        set.add(33);
        set.add(11); // duplicate value will not be added to the set
        System.out.println("Set: " + set);



    }
}
