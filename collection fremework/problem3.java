package a_class;

import java.util.ArrayList;
import java.util.HashMap;

// Group words by their length

public class problem3 {
    public static void main(String[] args) {
       String[] words = {"java", "hi", "go", "python", "c", "kotlin"};
       HashMap<Integer, ArrayList<String>> map = new HashMap<>();

       for(String w : words){
        int len =  w.length();
        map.putIfAbsent(len, new ArrayList<>());
        map.get(len).add(w);
       }

       System.out.println(map);
       
    }
}
