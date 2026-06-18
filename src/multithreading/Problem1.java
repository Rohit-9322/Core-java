package All_class_file;

// Problem 1 on Multithreading 

class c extends Thread{
    public void run(){
        while (true) {
            System.out.println("Good moring");
        }
    }
}


class cd extends Thread{
    public void run(){
        while (true) {
            System.out.println("Welcome");

            try{
            Thread.sleep(100);
            }
            catch(Exception e){
               System.out.println(e);
            }
        }
    }
}


public class Problem1 {
    public static void main(String[] args) {

        c o1 = new c();
        cd o2 = new cd();

        // demostrate 
        o1.setPriority(6);
        o2.setPriority(8);
        System.out.println(o1.getPriority());
        System.out.println(o2.getPriority());

        // State 
        System.out.println(o2.getState());

        // referance to the currrent thread 
        System.out.println(Thread.currentThread().getState());

        o1.start();
        o2.start();
        
    }
}
