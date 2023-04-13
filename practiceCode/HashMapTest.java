import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("ronkj74@gmail.com", "jordan ronk");
        userMap.put("kaitlin74@gmail.com", "Kaitlin Haggard");

        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));
        }

        // String name = userMap.get("ronkj74@gmail.com");
        // System.out.println(name);
    }
}
