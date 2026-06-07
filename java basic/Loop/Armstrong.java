package Loop;

public class Armstrong {
   public static void main(String[] args) {
     // Check Armstrong number 
    int nno =153;
    int temp = nno, sum =0;
    while(temp > 0){
        int LD = temp % 10;
        sum += LD * LD * LD;
        temp /=10;
    }
    System.out.println(nno  == sum ? "Aemstong" : " Not Armstrong" );
   }
}
