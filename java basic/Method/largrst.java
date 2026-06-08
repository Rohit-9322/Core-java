package Method;

  // Largest of Two Numbers

public class largrst {

     // using method 
    static int max(int a , int b){
    return (a>b)? a : b;
    }
    public static void main(String[] args) {
        System.out.println(max(8, 3));
    }


    // Samallest 
    static int min(int a , int b){
    return (a<b)? a : b;
    }
    public static void main(String[] args) {
        System.out.println(min(8, 3));
    }
    
}
