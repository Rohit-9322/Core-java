
// Inheritance in Interface
// 
interface sampleinterface{
     void meth1();
     void meth2();
}

interface chiledsampleinterface extends sampleinterface{

    void meth3();
    void meth4();

}

class Mysampleclass implements chiledsampleinterface{
    
    public void meth1(){
        System.out.println("Meth 1");
    }

    public void meth2(){
        System.out.println("Meth 2");
    }

    public void meth3(){
        System.out.println("Math 3");
    }

    public void meth4(){
        System.out.println("Math 4");
    }
}


public class Inheritance_inter {
    public static void main(String[] args) {
        
        Mysampleclass obj = new Mysampleclass();
        obj.meth3();
        obj.meth4();
        obj.meth1();
    }
}
