package lesson3;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {
    private static Object HashMap;

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1234, "Ivanov Ivan");
        map.put(456, "VIk Vik");
        map.put(789, "Kukusionok");
        map.put(147, "LH lh");

        System.out.println(map);

//        map.put(1234, "vania");
//        System.out.println(map);

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());

        System.out.println(map.entrySet());
        System.out.println(map.containsValue("VIk Vik"));

//        for (Map.Entry<Integer, String> entry:map.entrySet()){
//            if (entry.getValue().startsWith("Vik")){
//                System.out.println(entry.getKey());
//            }
//        }


//        id, lastNAme, firstName, age
        List<String> user = Arrays.asList("Ivanov", "Ivan", "55");
        Map<Integer, List<String>> users = new HashMap<>();
        users.put(1234, Arrays.asList("Ivanov", "Ivan", "55"));
        users.put(1234, Arrays.asList("Ivanov", "Ivan2", "52"));
        users.put(1234, Arrays.asList("Ivanov", "Ivan1", "54"));

        for (Map.Entry<Integer, List<String>> entry : users.entrySet()) {
            List<String> list = entry.getValue();
            Integer key = entry.getKey();

            if (Integer.parseInt(list.get(2)) > 18) {
                System.out.println(entry.getKey());
            }
        }

        Map<String, Object> user1 = new HashMap<>();
        user1.put("firstName", "Ivanov");
        user1.put("first1Name1", "Ivanov1");
        user1.put("age", 11);

        Map<String, Object> user2 = new HashMap<>();
        user1.put("222firstName", "Ivanov");
        user1.put("222first1Name1", "Ivanov1");
        user1.put("222age", 22);

        Map<String, Object> user3 = new HashMap<>();
        user1.put("3333firstName", "Ivanov");
        user1.put("333first1Name1", "Ivanov1");
        user1.put("age", 33);

        Map<Integer, Map<String, Object>> users1 = new HashMap<>();



    }
}
