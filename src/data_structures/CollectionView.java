package data_structures;

import java.util.HashMap;

public class CollectionView {

    /** INSTRUCTIONS
     *
     * A map is given to you below, with some data inserted into it.
     *
     * Retrieve the Collection view of the values present in map
     */

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");

        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.containsValue("NYC"));
        System.out.println(map.containsKey(7));

        System.out.println("Collection view is: " + map.values());

        HashMap<Integer, String> hash_map= new HashMap<Integer, String> ();
        hash_map.put (1, "NYC");
        hash_map.put(2, "LA");
        hash_map.put(3, "Denver");
        hash_map.put(4, "Boston");
        hash_map.put(5, "San Jose");
        hash_map.put(6, "Seattle");

        System.out.println("Collection view is: " + hash_map.values());



    }

}
