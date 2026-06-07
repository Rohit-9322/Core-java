package Loop;

public class prime_no {
    public static void main(String[] args) {
        //  Print Fibonacci series
        int n = 17;
        if (n == 2) {
            System.out.println(" This are prime no");
        }
        else{
            boolean isprime = true;
            for(int i=2; i<=Math.sqrt(n); i++){
                if (n % 2 == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
            System.out.println(" The prime no");
            }
            else{
                System.out.println("Not Prime ");
            }
        }
       
    }

    
}
