package Day2_loop;

public class Swap_XOR {
    public static void main(String[] args) {
        int a = 41, b =54;
    
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " +a+ " b = "+ b);
    }


}
