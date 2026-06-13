package oop;

interface Bicycle{

    int a = 45; // That is final
    void applyBreak(int decrement);
    void speedup(int increment);
     

}

interface HornBicycle{
    void blowHornk();
    void blowHornkmhm();
}

class Avoncycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println(" That sout only ");
    }

    public void applyBreak(int decrement){
        System.out.println("Applying Brack");
    }

   public void speedup(int increment){
        System.out.println(" Applying speedup ");
    }

   public void blowHornk(){
      System.out.println(" NOW That HORN Is bycycle only ");
    }

    public void blowHornkmhm(){
        System.out.println(" That are both bycycle and cycle ");
    }
}

public class Interface {
    public static void main(String[] args) {
        Avoncycle sd = new Avoncycle();
        sd.applyBreak(1);

        //YOU cannot modify the proparties in Interface as they are final
        System.out.println(sd.a);

        sd.blowHorn();
        sd.blowHornk();
        sd.blowHornkmhm();
    }
}
