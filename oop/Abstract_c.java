package oop;

 // Abstract class Working 



abstract class base{
    base(){
        System.out.println(" I Constracter of Base");
    }

    void sayhello(){
      System.out.println("Hello");
    }

    abstract void great();
    abstract void great1();
}


class base1 extends base{
    @Override
    void great(){
        System.out.println(" Good Moring ");
    }

    @Override
    void great1(){
        System.out.println("Good afteroon");
    }

    
    void name(){
        System.out.println("ni");
    }
}

abstract class base2 extends base{

    void the(){
        System.out.println("OH BHAI");
    }
}



public class Abstract_c {
    base1 scc = new base1();
    
    // base v = new base();

   //  base2 no = new base2();
}
