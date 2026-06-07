package Day2_loop;

public class Tenary_op {
    public static void main(String[] args) {

        //1] Find the smallest no in three no : 
        int a = 57;
        int b =65;
        int c = 95;

        int Smallest = ((a<b)? ((a<c)? a : c) :((b<c)? b : c));

        System.out.println("The smallest no is:--> " + Smallest);

        //2] find the Largest number in three no
         int A = 57;
         int B =65;
         int C = 95;

         int Largest = (A>B) ? ((A>C)? A:B) :((B>C)? B:C);
         System.out.println("The Largest no is :-> "+Largest);



         // 3] // Find the smallest no in 2 no : 
            int p = 57;
            int q = 65;

            int two_smallest = (p < q)? p : q;
            System.out.println(two_smallest);


        // 4] // Find the smallest no in 2 no : 
            int m = 57;
            int n = 65;

            int two_largest = (p > q)? p : q;
            System.out.println(two_largest);



            
    }
}
