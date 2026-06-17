package All_class_file;

//  Java Thread Priorities 

class myThr1 extends Thread{
    public myThr1(String name){
        super(name);
    }

    public void run(){
        
        while (true) {
           System.out.println("Thank You!"+this.getName());
        }
    }
}


public class thread_priorities {
    public static void main(String[] args) {
        
        myThr1 t1 = new myThr1("Ram1");
        myThr1 t2 = new myThr1("ram2");
        myThr1 t3 = new myThr1("ram3");
        myThr1 t4 = new myThr1("ram4");

        // priorities 
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    
       
    }
    
}





