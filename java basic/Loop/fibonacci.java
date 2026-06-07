package Loop;

public class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int no = 10;

        for(int i=1; i<=no; i++){
            System.out.print(a+" ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
