//package oop;


interface Mycamera{
    void takeshap();
    void recordvideo();
}

interface Mywifi{

    String[] getNOnetwork();
    void connectToNetwork(String network);
}


class Mycellphone{
    void callmo(int phone){
        System.out.println("Calling" + phone);
    }

    void pickcall(){
        System.out.println("Connecting...");
    }
}


class Mysmartphone extends Mycellphone implements Mycamera, Mywifi{
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

public class Interface_ex {
    public static void main(String[] args) {

        Mysmartphone ac = new Mysmartphone();

        String[] array = ac.getNOnetwork();
        for(String A : array){
            System.out.println(A);
        }

        
    }
}
