package a_class;

import java.util.TreeMap;

// TreeMap — sorted by key

public class TM {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("Rohit", 90);
        tm.put("Amit",  85);
        tm.put("Raj",   78);
        System.out.println(tm);               // {Amit=85, Raj=78, Rohit=90} 

    }
}
