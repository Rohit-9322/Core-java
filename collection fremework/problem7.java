package a_class;

import java.util.HashMap;
import java.util.Map;

public class problem7 {
    public static void main(String[] args) {
        String sentance = "java is best java is easy ";
        String words = sentance.split(" ");

        HashMap<String , Integer> map = new HashMap<>();

        for(String word : words){
            map.put(words, map.getOrDefault(words, 0)+1);
        }

        for(Map.Entry<String , Integer> e : map.entrySet()){
            System.out.println(e.getKey()+ " "+e.getValue());
        }
    }
}
