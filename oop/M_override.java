//package oop;

// Method Overriding

class A{
    int hello(){
        return 4;
    }

    void math2(){
        System.out.println(" I am method 2 in class A" );
    }
}

class B extends A{

    @Override
    void math2(){
        System.out.println(" I am method 2 in class B" );
    }

    void math3(){
        System.out.println(" I am method 3 in class B");
    }
}
public class M_override {
    public static void main(String[] args) {
        A a = new A();
        a.math2();


        B b = new B();
        b.math2();
    }
}
