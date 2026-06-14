package Abstact_interfece_Exier;


 // 2} Use the pen class from Q.1 to create a concreate classs 
 ///      funtainpen with addition method meet.


abstract class pen{
  abstract  void write();
    abstract void refil();
}


class fountainpen extends pen{
     void write(){
      System.out.println("Writeing the sentance ");
    }

    void refil(){

        System.out.println("Refil the pen ");
    }
 
     void meet(){
        System.out.println("meet");
     }

}



public class problrm2 {
    public static void main(String[] args) {

        fountainpen s = new fountainpen();
        s.refil();
        s.meet();

        
    }
}
