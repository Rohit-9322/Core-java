//package oop;

// Inheritance

class base{
    int x ;

    void setx(int x){
        this.x = x;
    }

    int getx(){
        return x;
    }

    void display(){
        System.out.println("I am Out");
    }
}


class devede extends base{
    int y;

    void setx(int y){
        this.y = y;
    }

    int getx(){
        return y;
    }

    void display(){
        System.out.println("I am Out");
    }

}
public class Inheritance {
    public static void main(String[] args) {

        base s1 = new base();
        s1.setx(12);
        s1.display();
        System.out.println(s1.getx());


        devede s2 = new devede();
        s2.setx(15);
        System.out.println(s2.getx());
        s2.display();
        
        
    }
}
