
// Polymorphism using Interface 


interface Mycamera2{
    void takeshap();
    void recordvideo();

    private void too(){
        System.out.println(" Priveta  good ");
    }

    // dafult method 
    default void recording4kvideo(){
        too();  // Accase prive in defult 
        System.out.println("That Recording 4K video");
    }
}

interface Mywifi2{

    String[] getNOnetwork();
    void connectToNetwork(String network);
}


class Mycellphone2{
    void callmo(int phone){
        System.out.println("Calling" + phone);
    }

    void pickcall(){
        System.out.println("Connecting...");
    }
}


class Mysmartphone extends Mycellphone2 implements Mycamera2, Mywifi2{
    public void takeshap(){
        System.out.println("Takng shap ");
    }

    public void recordvideo(){
        System.out.println("Record video ");
    }

    public String[] getNOnetwork(){
        System.out.println(" Getteing List of Network");
        String[] network = {"WAN", "LAN","MAN"};
        return network;
    }

    public void connectToNetwork(String network){
        System.out.println("THE Name of Network is " + network);
    }


}

public class Polymorphism_inter {
    public static void main(String[] args) {

        // polymorphism types --> 

         Mycamera2 c = new Mysmartphone();  // This is smart phone but use only camera

         //c.getNOnetwork();   --- Not Allowed 
         c.takeshap();
         c.recording4kvideo();

         Mywifi2 w = new Mysmartphone();
         //w.takeshap(); // crreate problem 
         String[] p = w.getNOnetwork();
         for(String k : p){
            System.out.println(k);
         }

         // public 
         Mysmartphone ac = new Mysmartphone();
         ac.getNOnetwork();
         ac.pickcall();
         ac.callmo(452);
    }

    
}