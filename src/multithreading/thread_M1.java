package All_class_file;

// Interrupt method 

class m3 extends Thread{
    public void run(){
        int i = 0;
        while (true) {
            System.out.println("Thank you");

            try{
                Thread.sleep(566);
            }
            catch(InterruptedException e){

                System.out.println(e);
            }
            
        }

    }
}

class m4 extends Thread{
    public void run(){
        while (true) {
            System.out.println("Thank You Bhai");
        }
    }
}

public class thread_M1 {
    public static void main(String[] args) {
        
        m3 t = new m3();
        m4 r = new m4();

        t.start();
        r.start();
    }
}

