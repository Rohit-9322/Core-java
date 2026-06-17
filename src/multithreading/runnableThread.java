package All_class_file;

//  Using By Thread(Runnable r)

class myThr extends Thread{
    public myThr(Runnable r){
        super(r);
    }

    public void run(){
        int i =45;
        System.out.println("Thank you");
        // while (true) {
        //    System.out.println("That Thread class ");
        // }
    }
}


public class runnableThread {
    public static void main(String[] args) {
        
        myThr obj = new myThr();
       Thread t1 = new Thread(obj);

        System.out.println("The id of Thread class is "+ obj.getId());
        System.out.println("The name of Thread is "+ obj.getName());
    }
    
}



//runnableThread
