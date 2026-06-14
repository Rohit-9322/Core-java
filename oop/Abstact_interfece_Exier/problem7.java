package Abstact_interfece_Exier;

//  Create aclass smarttv which implement tvremote interface from q6
interface Tvremote{
    void battens();
    void light();
}

interface SmartTvremote extends Tvremote{
    void smartswith();
}

class smartTv implements SmartTvremote{
 
    public void smartswith(){
        System.out.println("ON/OFF");
    }

    public void battens(){
         System.out.println("That as remote battens");
    }

    public void light(){
        System.out.println(" press battens that lighat ");
    }
}


public class problem7 {
    public static void main(String[] args) {
        // poly 
        Tvremote sd = new smartTv();
        // sd.smartswith(); -> Now only axis Tvremote 
        sd.battens();

        smartTv qw = new smartTv();
        qw.smartswith();
        qw.battens();

    }
}

