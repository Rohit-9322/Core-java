package a_class;

import java.util.HashSet;

// HashSet --- duplicate — ignored
public class HS {
    public static void main(String[] args) {
        HashSet<String> n =new HashSet<>();

        n.add("java");
        n.add("c++");
        n.add("c++");   // duplicate — ignored
        n.add("c");

        System.out.println(n.contains("java"));  // true 

        for(String s : n){

            System.out.println(s);
        }


    }
}
