package a_class;

import java.util.HashMap;
import java.util.Map;

// HashMap -- key duplicate — value updated


public class HM {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
 
        map.put("Rohit", 90);
        map.put("Amit",  85);
        map.put("Raj",   78);
        map.put("Rohit", 95);

        System.out.println(map.get("Rohit"));

        // check key/value
        System.out.println(map.containsKey("Amit"));   // true
        System.out.println(map.containsValue(78));     // true

        // remove 
        map.remove("Rohit");

       

        for(Map.Entry<String , Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+ " = "+entry.getValue());
        }
    }
}
