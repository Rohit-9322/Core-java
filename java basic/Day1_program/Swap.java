package Day1_program;

public class Swap {

    public static void main(String[] args) {
        
        // 1] Swaping the number without thred verible
         
          int a = 10;
          int b = 20;

        // Swap
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(" The a is :--> " +a);
        System.out.println("The b is :--> "+ b);
    }
}
