

// Project 3 

// Create a class Game , Which allow to play "Gass the no"  same one . 
// cantein 
// a] constructor 
// b] takeuserinput
// c] iscorrectnumber 

import java.util.Random;
import java.util.Scanner;

class Game{
    private int number;
    private int userinput;
    private int noofgasses;;


    // constractor 
    public Game(){
      Random r = new Random();
      number = r.nextInt(100)+1;
    }


    // Take user input 

    public void takeuserinput(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Number --> ");
        userinput = sc.nextInt();

    }

    // Check number 
    boolean iscorrectnumber(){
        noofgasses ++;

        if (userinput == number) {
            System.out.println("Correct! you Gassed it");
            System.out.println("Gesses Count --> " + noofgasses);
            return true;
        }
        else if (userinput < number) {
            System.out.println("TO Increase! ");
        }
        else{
            System.out.println("TO Dicreases! ");
        }
        return false;
    }

    // getter
    public int getNoofgasses() {
        return noofgasses;
    }


    // Setter 
    public void setNoofgasses(int noofgasses) {
        this.noofgasses = noofgasses;
    }
}



public class project3 {

    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;

        while (!b) {
            g.takeuserinput();
            b = g.iscorrectnumber();
        }
    }

    
}
