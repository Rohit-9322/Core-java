package a_class;

import java.util.HashMap;

// Frequency Count
public class Freq {
    public static void main(String[] args) {
        String[] arr = {"Java", "Python", "Java", "C++", "Python", "Java"};
        HashMap<String, Integer> map = new HashMap<>();

        for(String s : arr){
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        System.out.println(map);
    }
}
