import java.util.HashMap;
class ChangeELementsOfHashMap{
       public static void main(String[] args) {
           HashMap<String, Integer> map = new HashMap<>();
           map.put("apple", 1);
           map.put("banana", 2);

           System.out.println("Original map: " + map); // Output: {banana=2, apple=1}

           // Update value for "apple"
           map.put("apple", 3);
           System.out.println("Map with updated value: " + map); // Output: {banana=2, apple=3}

           // Add new key-value pair
           map.put("orange", 4);
           System.out.println("Map after adding new entry: " + map); // Output: {banana=2, orange=4, apple=3}
       }
   }