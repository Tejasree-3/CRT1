import java.util.HashMap;
import java.util.Map;
public class HashMapConstructor {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("one", 1);
        System.out.println("Map 1: " + map1);
        HashMap<String, Integer> map2 = new HashMap<>(20);
        map2.put("two", 2);
        System.out.println("Map 2: " + map2);
        HashMap<String, Integer> map3 = new HashMap<>(10, 0.9f);
        map3.put("three", 3);
        System.outred.println("Map 3: " + map3);
        Map<String, Integer> anotherMap = Map.of("four", 4, "five", 5);
        HashMap<String, Integer> map4 = new HashMap<>(anotherMap);
        System.out.println("Map 4: " + map4);
    }
}