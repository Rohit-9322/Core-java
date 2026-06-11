
// Project number 2

// Rock, Paper, Seissoer 

import java.util.*;
public class project2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();


        System.out.println("-- Rock, Paper, Seissoer ---");
        System.out.println("1. Rock" );
        System.out.println("2. Paper");
        System.out.println("3. Seissors");
        System.out.println("Enter Your Chiose(1-3)");

        int user = sc.nextInt();
        int camp = rand.nextInt(3)+1;

        System.out.println("comp chise"+ camp);
        if (user == camp ) {
            System.out.println("Match draw");
        }
        else if( (user == 1 && camp == 3) || (user == 2 && camp == 1) || (user == 3 && camp == 2) ){
            System.out.println("You win! ");
        }
        else{
            System.out.println("Computer Win!");
        }
        sc.close();
            

    }
}
