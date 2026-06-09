class Bank{
    double rate(){
        return 0;
    }
}

class SBI extends Bank{
    double rate(){
        return 7.5;
    }
}

class HDFC extends Bank{
    double rate(){
        return 8.0;
    }
}


public class M_override1 {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.rate();

        SBI c = new SBI();
        System.out.println(c.rate());

         HDFC h = new HDFC();
        System.out.println(h.rate());
    }
}
