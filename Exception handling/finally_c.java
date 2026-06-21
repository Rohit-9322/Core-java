package all_class;
/// Finally Keywords 

public class finally_c {

    // That return try block but also run the finally block 
    public static int great(){
        try {
            int a = 5;
            int b = 0;
            int c = a/b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("This Program is end!");
        }
        return -1;
    }


    public static void main(String[] args) {
       int c = great();
       System.out.println(c);

       // Using While --> That break but finally block run 
       int m = 7;
       int n =9;
       while (true) {
        try {
          System.out.println(m/n);
        } catch (Exception e) {
            System.out.println(e);
            break;
        }
        finally{
            System.out.println("That is n Is "+n);
        }
        n--;

       }


       // try -- finally 
       try{
        System.out.println(m*n);
       }
       finally{
        System.out.println("That a try & finally block ");
       }
        
    }
}