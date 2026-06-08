 package Method;

// Check even or odd using method
public class Even {

     static String cheack(int n){
        return (n % 2 == 0)? "even" : " odd ";
    }

    public static void main(String[] args) {
        System.out.println(cheack(7));
        System.out.println(cheack(14));
    }
    
}
