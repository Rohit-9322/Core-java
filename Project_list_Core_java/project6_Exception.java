package p5;

/*Exercise 6: You have to create a custom calculator with following operations:
1. Addition
2. Subtraction
3. * -> Multiplication
4./ -> Division
which throws the following exceptions:
1. Invalid input Exception ex: 8 & 9
2. Cannot divide by 0 Exception
3. Max Input Exception if any of the inputs is greater than 100000
4. Max Multiplier Reached Exception Don't allow any multiplication input to be greater than 7000

*/

class InvalidinputException extends Exception{
    @Override
    public String getMessage() {
       
        return " Do Not Enter 8 and 9";
    }
}

class Cannotdivide extends Exception{
    @Override
    public String getMessage() {
        return"Cannot divide by zero ";
    }
}

class MaxInputException extends Exception{
    @Override
    public String getMessage() {
        return " Enter input only less than 10000";
    }
}

class MaxMultiplierReachedException extends Exception{
    @Override
    public String getMessage() {
        return "Multiplicatuon number limite is 7000";
    }
}



class calculator {

    public int add(int a, int b) throws InvalidinputException,MaxInputException{
       if (a == 8 || a == 9 || b == 8 || b == 9) {
             throw new InvalidinputException();        
       }

       if (a > 1000 || b > 1000) {
        throw new MaxInputException();
       }

       return a + b;
    }


    public int sub(int a, int b) throws InvalidinputException,MaxInputException{
       if (a == 8 || a == 9 || b == 8 || b == 9) {
             throw new InvalidinputException();        
       }

       if (a > 1000 || b > 1000) {
        throw new MaxInputException();
       }

       return a - b;
    }

    public int mul(int a, int b) throws InvalidinputException,MaxInputException,MaxMultiplierReachedException{
       if (a == 8 || a == 9 || b == 8 || b == 9) {
             throw new InvalidinputException();        
       }

       if (a > 1000 || b > 1000) {
        throw new MaxInputException();
       }

       if (a > 7000 || b > 7000) {
        throw new MaxMultiplierReachedException();
       }
       return a * b;
    }

   
    public int div(int a, int b) throws InvalidinputException,MaxInputException,Cannotdivide{
       if (a == 8 || a == 9 || b == 8 || b == 9) {
             throw new InvalidinputException();        
       }

       if (a > 1000 || b > 1000) {
        throw new MaxInputException();
       }

       if (b == 0) {
        throw new Cannotdivide(); 
       }
       return a / b;
    } 
}

public class project6_Exception {

    public static void main(String[] args) {
        
        calculator obj = new calculator();

        try {
            System.out.println(obj.add(4, 5));
            System.out.println(obj.sub(98, 12));
            System.out.println(obj.mul(80, 54));
            System.out.println(obj.div(45, 0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }


    
}
