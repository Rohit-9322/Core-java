package Abstact_interfece_Exier;

// 4} Create a class telephone with ring(),high(),and disconncet method
//      as abstact method , create another class smartteli and demostate poly

abstract class telephone{
    abstract void ring();
    abstract void hold();
    abstract void disconncet();

}

class SmartTelephone extends telephone{
   
    @Override
   public void ring(){
    System.out.println(" That ringing ");
   }

   @Override
   public void hold(){
    System.out.println(" On hold ");
   }

   @Override
   public void disconncet(){
    System.out.println(" call is discoonerting ");
   }
}
public class problem4 {

    public static void main(String[] args) {
        telephone as = new SmartTelephone();
        as.disconncet();
    }
    
}
