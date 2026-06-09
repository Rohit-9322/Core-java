class Super{

    public void case1(){
        System.out.println("I am case 1");
    }

    public void case2(){
      System.out.println("I am case 2 in super class");        
    }
}

class subclass extends Super{
    @Override
    public void case2(){
      System.out.println("I am case 2 in subclass");        
    }

    public void case3(){
        System.out.println("I am case 3");
    }
}


public class runtime {
    public static void main(String[] args) {

        // Super s = new Super();
        // s.case1();

        // subclass sc = new subclass();
        // sc.case2();
        

        Super obj = new subclass();
        obj.case1();
        obj.case2();    // I am case 2 in subclass   {call in object of subclass}

       //  obj.case3();   // give the error 
    }
}
