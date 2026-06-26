package a_class;

// Find The comman element between the list 
import java.util.ArrayList;
import java.util.HashSet;


public class problem6 {
    public static void main(String[] args) {
        
        ArrayList<Integer> l1 =new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);

        ArrayList<Integer> l2 =new ArrayList<>();

        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);

        HashSet<Integer> set = new HashSet<>(l1);
        set.containsAll(l1);

        
    }
}
