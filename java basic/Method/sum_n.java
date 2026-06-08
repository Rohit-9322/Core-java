package Method;

// Sum of First N Numbers

public class sum_n {
    static int sumn(int n){
        if (n == 1) {
            return n;
        }
        else{
            return n + sumn(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumn(5));
    }
}
