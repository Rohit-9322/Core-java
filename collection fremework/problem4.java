package a_class;

//  Remove duplicates from ArrayList
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class problem4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3); list.add(3); list.add(4);

 
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        ArrayList<Integer> result = new ArrayList<>(set);

        System.out.println(result);
    }
}
