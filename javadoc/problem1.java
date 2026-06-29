package a_class;
/*
Create a class and add a method with depereted a matation , what is it affect on program 
 */

class MyDef{
    @Deprecated
    void good1(){
        System.out.println(" Know that ");
    }
}
public class problem1 {
    public static void main(String[] args) {
        MyDef D = new MyDef();
        D.good1();
        
    }
}
