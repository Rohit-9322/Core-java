package oop;

// Class and Object creaction 

class student{

    String name;
    int age;

    int mark;

    // method 
    void display(){
        System.out.println(name + " " + age + " "+ mark);
    }

}

public class Class_obj {

    public static void main(String[] args) {
        
        // Object 
        student s1 = new student();
        s1.name = "Rohit";
        s1.age = 22;
        s1.display();

        student s2 = new student();
        s2.name = "Rohit wankhade";
        s2.age = 21;
        s2.mark = 89;
        s2.display();

    }
}
