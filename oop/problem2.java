
// what is the order of constractor excution for the follwing nherteze hireachy 

class Base{
    int A;

    public int getA() {
        return A;
    }

    Base(int A){
    System.out.println(" The A is that Base Class");
     this.A = A;
    }
}

class Stage1 extends Base{
   int B;

   public int getB() {
    return B;
   }

   Stage1(int A , int B){
    super(A);
    System.out.println("That is the second Stage1 ");
    this.B = B;
   }

}

class Stage2 extends Stage1{
    int c;

    public int getC() {
        return c;
    }

    Stage2(int A, int B, int c){
        super(A, B);
        System.out.println("That is the last stage2");
        this.c = c;
    }
}


public class problem2 {
    
    public static void main(String[] args) {
         
        // Stage1 dc = new Stage1(11, 87);

        // System.out.println(dc.getA());
        // System.out.println(dc.getB());


       Stage2 sc = new Stage2(15,12 , 14);

    }
}
