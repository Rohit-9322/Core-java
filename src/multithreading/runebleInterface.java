package All_class_file;

// Implementing Runnble interface  

class A implements Runnable{
    @Override
   public void run(){
    int i = 0;
    while (i < 10) {
        System.out.println(" That is Thread 1");
        i++;
    }
   }
}

class B implements Runnable{
    @Override
   public void run(){
    int i = 0;
    while (i < 10) {
        System.out.println(" That is Thread 2");
        i++;
    }
   }
}
public class runebleInterface {
    public static void main(String[] args) {

        A obj1 = new A();
        Thread t1 = new Thread(obj1);

        B obj2 = new B();
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
        
    }
}
