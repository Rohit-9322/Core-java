package All_class_file;

// java Thread Method 

class m1 extends Thread{
    public void run(){
        int i = 0;
        while (i<556) {
            System.out.println("Thank you");
             i++;
        }

    }
}

class m2 extends Thread{
    public void run(){
        while (true) {
            System.out.println("Thank You Bhai");
        }
    }
}

public class thread_m {
    public static void main(String[] args) {
        
        m1 t = new m1();
        m2 r = new m2();

        t.start();

        try{
           t.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        

        r.start();
    }
}
