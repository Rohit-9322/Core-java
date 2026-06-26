package a_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Sort ArrayList of Object 

class Student{
    String name;
    int marks;

    Student(String name, int marks){
            this.name = name;
            this.marks = marks;
    }
}
public class problem5 {
    public static void main(String[] args) {
        ArrayList<Student> l1 = new ArrayList<>();

        l1.add(new Student("Rohit", 90));
        l1.add(new Student("Amit", 75));
        l1.add(new Student("Raj", 85));

        // Sort 
        Collections.sort(l1, Comparator.comparingInt(s ->s.marks));
        for(Student s : l1){
            System.out.println(s.name + " "+s.marks);
        }



    }
}
