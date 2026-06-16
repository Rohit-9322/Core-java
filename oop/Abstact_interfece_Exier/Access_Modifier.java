//package Abstact_interfece_Exier;


// Access Modifire using 

class c1{
    public int x =5;
    protected int y = 45;
    int z = 6;
    private int a = 78;


    // 1 
    public static void main(String[] args) {
        c1 obj = new c1();

        System.out.println(obj.x);  // Public
        System.out.println(obj.y);  // ptotected 
        System.out.println(obj.z);   // default 

        System.out.println(obj.a);   //- Private 
    }

}

public class Access_Modifier {

    // 2 
    public static void main(String[] args) {
        
        System.out.println();
        c1 obj = new c1();
        System.out.println(obj.x);  // Public
        System.out.println(obj.y);  // ptotected 
        System.out.println(obj.z);   // default 

       // System.out.println(obj.a);   // ERROR - Private 
        
    }
}
