package a_class;

import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList<Integer> q1 = new LinkedList<>();

        q1.add(10);
        q1.add(11);
        q1.add(12);

        q1.addFirst(5);
        q1.addLast(122);


        q1.removeFirst();
        q1.removeLast();

        for(int a : q1){
            System.out.print(a+", ");
        }
    }
}
