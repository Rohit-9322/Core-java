package Day2_loop;

public class E_V {

    // Check even or odd without % operator
    public static void main(String[] args) {
        int lo =  7;
        if ((lo & 1) == 0) {
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

        // 2}   with %

        if (lo % 2 == 0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
