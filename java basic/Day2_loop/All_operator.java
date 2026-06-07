package Day2_loop;


public class All_operator {
    public static void main(String[] args) {


        // 1} Calculator using all arithmetic operators
        int a = 10, b = 12;

        System.out.println("Add:--> "+(a+b));
        System.out.println("Subtract :--> "+(a-b));
        System.out.println("Multiply:--> "+(a*b));
        System.out.println("Divide:--> "+(a/b));
        System.out.println("Modulus:--> "+(a%b));



        // 2} Calculator using all assigment operators
        int A = 10; 
        A += 5;   // 15
        A -= 2;    // 13
        A *= 5;    // 65
        A /= 7;    // 9
        A %= 5;     // 4

        System.out.println(A);

        

        //3] Relational (Comparison) Operators
        int m = 10 , n = 20;
        System.out.println(m == n);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
          
        System.out.println();


        //4}  Logical Operators
        int age = 20;
        boolean hasid = true;

        
        System.out.println(age >= 18 || hasid == false); // true
        System.out.println(age >= 18 && hasid == true);  // true
        System.out.println(!hasid);

 
        // 5}  Increment and Decrement Operators
        int p =5;
        System.out.println(p++);   // 5
        System.out.println(p);      // 6

        int q = 5;
        System.out.println(++q);    // 6
        System.out.println(q);      // 6

        int k = 85;
        System.out.println(k--);      // 85
        System.out.println(--k);       // 83



        // 6} Bitwise Operator 
        System.out.println();
        int rk = 5;
        int bk = 3;

        System.out.println(rk&bk);
        System.out.println(rk | bk);
        System.out.println(rk ^ bk);
        System.out.println(~rk);        // NOT (Flips all bits)
        System.out.println(rk << 1);  // -- Left shift (multipiction by 2)
        System.out.println(rk >> 1); //  -- Right shift(divide by 2)



        // 7 } Ternary Operator

        int num = 7;
        String result = (num % 2 == 0)? "Even":"odd";
        System.out.println(result);

        // 8} instanceof Operator
        System.out.println();
        String name = "Rohit";

        System.out.println(name instanceof String); // true
       // System.out.println(name instanceof Integer);  

    }
}
