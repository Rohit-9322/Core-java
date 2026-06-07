package Day2_loop;

public class Swich1 {
    public static void main(String[] args) {
        int a = 12;
        int b = 15;

        char ch = '+';

        switch (ch) {
            case '+':
                System.out.println(a+b);
                break;
            case '-': 
               System.out.println(a-b);
               break;
               
            case '*':
                System.out.println(a*b);  
                
            case '/':
                System.out.println(a/b);    
        
            default:
                System.out.println("Not Exit that operator");
                break;
        }
    }
}
