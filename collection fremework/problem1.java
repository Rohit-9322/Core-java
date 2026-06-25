package a_class;

// Find The Duplicate element of Array 
import java.util.HashMap;

public class problem1 {
    public static void main(String[] args) {
        int[] mark = {1,2,3,2,3,4,5};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x : mark){
           map.put(x, map.getOrDefault(x, 0)+1);

        }

        System.out.println("Duplicate!");
        for(int key : map.keySet()){
            if (map.get(key) > 1) {
                System.out.println(key+" ");
            }
        }
    }
}
