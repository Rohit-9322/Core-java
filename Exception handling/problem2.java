package all_class;

// Haha --> during Arithmatic excepation 
// HeHe ---> Inllegal exception 

public class problem2 {
    public static void main(String[] args) {
        
        try {
            int a = 666/0;
        } 
        catch (ArithmeticException e) {
            System.out.println("HaHa");
        }
        catch(IllegalArgumentException  e){
           System.out.println("HeHe");
        }
    }
}
