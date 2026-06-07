package Loop;

public class Reverse {
    public static void main(String[] args) {

        // 1} 
        int no = 12345;
        int Reverse = 0;
        while (no > 0) {
            int ld = no % 10;
            Reverse = (Reverse * 10) + ld;
            no /= 10;

        }
        System.out.println(Reverse);


        // 2} 
        int n = 12345;
        while (n > 0) {
            int LD = n % 10;
            System.out.print(LD);
             no = n / 10;
        }


    }
}
