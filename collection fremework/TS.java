package a_class;

import java.util.TreeSet;

// TreeSet -- sorted, no duplicates
public class TS {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(50);
        t.add(50);
        t.add(10);

        System.out.println(t);

    }
}
