import java.util.HashMap;
public class AddElementsToHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Orange", 20);
        map.put("Banana", 30);
        System.out.println(map);
        map.put("Apple", 15);
        System.out.println(map);
    }
}
