package oop;

 // Default Constructor

 class Student{

    Student(){
        System.out.println(" Default Constructor");
    }
 }



 // Constructor Initializing Values

 class rohit{
 
    String name;
    int age;

    rohit(){
        name = "Rohit wankhade";
        age = 22;
    }

    void display(){
        System.out.println(name);
        System.out.println(age);
    }
 }


// Parameterized Constructor

class empolye{
    int age;
    String name;

    empolye(String n, int a){
        name = n;
        age = a;
    }

    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}


// Constructor Using this Keyword
class empolye1{
    int age;
    String name;

    empolye1(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}


public class constuctor {
    public static void main(String[] args) {

        Student s1 = new Student();

        rohit s2 = new rohit();
        s2.display();

        empolye s3 = new empolye("kunal", 15);
        s3.display();


         empolye1 s4 = new empolye1("pune", 15);
        s4.display();
    }




}
