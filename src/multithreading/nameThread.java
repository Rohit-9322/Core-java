package All_class_file;

//  Using By Thread(String name)

class myThr extends Thread{
    public myThr(String name){
        super(name);
    }

    public void run(){
        int i =45;
        System.out.println("Thank you");
        // while (true) {
        //    System.out.println("That Thread class ");
        // }
    }
}


public class nameThread {
    public static void main(String[] args) {
        
        myThr obj = new myThr("Ram");
        obj.start();

        System.out.println("The id of Thread class is "+ obj.getId());
        System.out.println("The name of Thread is "+ obj.getName());

        myThr obj2 = new myThr("Radha");
        obj2.start();

        System.out.println("The id of Thread class is "+ obj2.getId());
        System.out.println("The name of Thread is "+ obj2.getName());
    }
    
}
