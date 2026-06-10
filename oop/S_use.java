
// create a class and use inheritance to create another class cylinder from it.
// using super 

class circle{
    public int redius;

    circle(){
        System.out.println("I am not parameter class");
    }

    circle(int r){
        System.out.println(" I am circle parameter constactor  ");
        this.redius = r;
    }

    public double area(){
        return Math.PI * this.redius * this.redius;
    }
}

class cylinder1 extends circle{

    public int hight;
    cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder parameter constactor");

        this.hight = h;
    }

    public double valume(){

        return Math.PI * this.redius * this.redius* this.hight; 
    }
}


public class S_use{
    public static void main(String[] args){
        System.out.println("Rohit");

       // circle obj = new circle(12);
       cylinder1 obj = new cylinder1(4, 5);
    }
}
 