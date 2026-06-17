package All_class_file;

// Implementing Runnble interface  
// Using Thread(Runnable r)

class A implements Runnable{
    @Override
   public void run(){
    int i = 0;
    System.out.println("Wel come ");
   }
}

class B implements Runnable{
    @Override
   public void run(){
    int i = 0;
    System.out.println("That Enter to class B");
   }
}
public class runebleInterface {
    public static void main(String[] args) {

        A obj1 = new A();

        // Using Thread(Runnable r)
        Thread t1 = new Thread(obj1,"ram");
        System.out.println("The runnable id is "+ t1.getId());
        System.out.println("Thread Nmae "+ t1.getName());

        B obj2 = new B();

        // Using Thread(Runnable r)
        Thread t2 = new Thread(obj2,"sita");
        System.out.println("The runnable id is "+ t2.getId());
        System.out.println("Thread Nmae "+ t2.getName());

        t1.start();
        t2.start();
        
    }
}
