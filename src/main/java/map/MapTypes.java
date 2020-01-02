package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Alex Komanov
 */
public class MapTypes {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>(); // No order of (key,value)

        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>(); //Order by added objects

        Map<Integer, String> treeMap = new TreeMap<Integer, String>(); // Order by the key(natural order)

        testMap(hashMap);
        System.out.println("======================================");
        testMap(linkedHashMap);
        System.out.println("======================================");
        testMap(treeMap);

    }

    public static void testMap(Map<Integer, String> map){
        map.put(12, "454645645");
        map.put(1500, "ertrewer");
        map.put(0, "e4r4r4");
        map.put(1, "cvcswwe");
        map.put(1000, "zasxcdewq");
        map.put(800, "454645645");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
