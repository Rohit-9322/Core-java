package All_class_file;

// Using Thread(Runnable r, String name)

class S implements Runnable{
    @Override
    public void run(){
       for(int i=0; i<=5; i++ ){
        System.out.println(Thread.currentThread().getName()+" : "+i);
       }
    }
}


public class runnableThread {
    public static void main(String[] args) {

        S obj = new S();

        // Using Thread(Runnable r, String name)
        Thread t1 = new Thread(obj, "Rohit");

        t1.start();

        // t1.join(); // wait until thread finishes // But is not run without try-catch
        
       System.out.println("Thread ID : " + t1.getId());
       System.out.println("Thread Name : " + t1.getName());
    }
    
}



//runnableThread
