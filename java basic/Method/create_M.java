package Method;

// How to write the Method 
public class create_M {

    // 1. No parameter, no return
     void kam(){
    System.out.print(" Rohit ");

    }
    
    // 2. With parameter, no return
     void greetUser(String name) {
      System.out.println("Hello " + name);
    }

    // 3. With parameter, with return
    int add(int a, int b){
        return a + b;
    }


    // 4. Static method — no object needed
    static void display(){
     System.out.println("Static method");
    }


    
    public static void main(String[] args) {
        create_M obj = new create_M();

        //1
        obj.kam();

        //2 
        obj.greetUser("Rohit");

        // 3
        System.out.println(obj.add(5, 10));

        // 4
        display();
    }
}
