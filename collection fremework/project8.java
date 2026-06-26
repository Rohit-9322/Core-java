package a_class;

import java.util.LinkedList;
import java.util.Queue;

public class project8 {
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<>();

        queue.offer("Rohit");
        queue.offer("Amit");
        queue.offer("Raj");

        System.out.println(queue.peek());
        System.out.println(queue.poll());
    }
}
