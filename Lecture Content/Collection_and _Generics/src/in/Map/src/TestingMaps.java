import java.util.HashMap;
import java.util.Map;

public class TestingMaps {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Shekhar", 28);
        map.put("Zoro", 100);
        map.put("Siamf", 10);

        System.out.println(map.size());
        System.out.println(map.get("Shekhar"));
        System.out.println(map.get("shekhar"));            // null

        System.out.println(map.containsKey("Ram"));
        System.out.println(map.remove("Zoro"));
        System.out.println(map.containsKey("Zoro"));

//        map.forEach(String key : map.keySet());

        for (String key : map.keySet()) {
            System.out.printf(key, map.get(key));
        }
//        map.keySet().iterator()

    }
}
