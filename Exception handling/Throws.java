package all_class;

// Throw and Throws

class NegativeRediusException extends Exception{
    @Override
    public String toString() {

       // return super.toString() ;
       return "You cant Enter Negative value";
    }

    @Override
    public String getMessage() {
       // return super.getMessage();
       return " You cant Enter Negative value";
    }
}


public class Throws {

    public static double area(int r) throws NegativeRediusException{
        if (r < 0) {
            throw new NegativeRediusException();
        }
        double result =Math.PI*r*r;
        return result;
    }

    public static int divide(int a, int b){
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try {
            // int c = divide(10, 4);
            //    System.out.println(c);

             double d = area(-6);
             System.out.println(d);
        } catch (Exception e) {
            System.out.println("Exception");
        }

        
    }
    
}
