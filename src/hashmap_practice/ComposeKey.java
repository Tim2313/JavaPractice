package hashmap_practice;

import java.util.HashMap;
import java.util.Map;

public class ComposeKey {
    public static void main(String[] args) {

        String method = "GET";
        String path = "/html/developers";

        Map<String, String> hashMap = new HashMap();

        String messageFormat = "%s%s";
        String composeKey = String.format(messageFormat, method, path);

        String magic = "Magic";
        hashMap.put(composeKey, magic);

        String result = hashMap.get(composeKey);

        System.out.println(result);
    }
}
