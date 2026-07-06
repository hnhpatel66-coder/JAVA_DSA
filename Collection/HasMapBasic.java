import java.util.*;

public class HasMapBasic {
    public static void main(String[] args) {
        
        Map<String, String> maping = new HashMap<>();
        maping.put("in" , "India");
        maping.put("us" , "United States");
        maping.put("uk" , "United Kingdom");

        System.out.println("Map: " + maping);
        System.out.println(maping.containsKey("in"));
        System.out.println(maping.containsKey("jp"));

        System.out.println(maping.containsValue("India"));
        
        System.out.println("Value for key 'in': " + maping.get("in"));
        System.out.println("Value for key 'uk': " + maping.get("uk"));

        Map<String, String> Table = new HashMap<>();
        Table.put("br", "Brazil");
        Table.put("fr", "France");

        System.out.println("Table: " + Table);
        Table.putAll(maping); // putAll => copies all of the mappings from the specified map to this map
        System.out.println("Table: " + Table);

        Table.remove("br");
        System.out.println("Table after removing 'br': " + Table);

        System.out.println("Size of the Table: " + Table.size());

        Table.putIfAbsent("ind", "India3"); 
        System.out.println("Table after putIfAbsent: " + Table);
    }
}
