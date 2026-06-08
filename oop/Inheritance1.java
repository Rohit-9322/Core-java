package oop;

// Inheritance 

class Parent{
    Parent(){
        System.out.println("I am parent");
    }
    Parent(int x){
        System.out.println("The is the base class parent " + x);
    }

}

class dirived extends Parent{
    dirived(){
     System.out.println(" I am dirive");
    }  
    
    dirived(int x, int y){
     super(x);
     System.out.println("This is Base2 dirived class" + y);
    }
    
}

class chilled extends dirived{
    chilled(){
        System.out.println(" The is CHiled ");
    }

    chilled(int x, int y, int z){
        super(x, y);
        System.out.println("Thre is the chile class" + z);
    }
}
public class Inheritance1 {

    public static void main(String[] args) {
        
        chilled ch = new chilled(4,2,6);
    }
    
}
