package All_class_file;

// Extending Threads class 

class myThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while (i<4000) {
            System.out.println("My codding thread is reaning ");
            System.out.println(" I am Happy ");
            i++;
        }
    }
}


class myThread2 extends Thread{
    @Override
    public void run(){
        int i =0;
        while (i<4000) {
            System.out.println(" Thread 2 for chatting  ");
            System.out.println(" I am Sad ");
            i++;
        }
    }
}
public class Extending_thread {

    public static void main(String[] args) {
        myThread1 as = new myThread1();
        myThread2 sd = new myThread2();
        as.start();
        sd.start();
    }
    
}

