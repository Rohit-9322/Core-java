 package Day2_loop;

public class betwise {
    
    public static void main(String[] args) {
        
    // Check if a Number is Power of 2 Using Bitwise Operato
    int n = 16;
    
    if(n >0 && (n & (n-1)) == 0){
        System.out.println("Power of 2 ");
    }else{
        System.out.println("Not power of 2");
    }
    }

}
