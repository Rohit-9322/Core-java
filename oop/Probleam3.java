class rectangle{
    double length;
    double breath;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreath() {
        return breath;
    }

    public void setBreath(double breath) {
        this.breath = breath;
    }

    rectangle(double length, double breath){
        this.length = length;
        this.breath = breath;
    }

    double area(){
        return length * breath;
    }
}


class cuboid extends rectangle{
    double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    cuboid(double length, double breath , double height){
        super(length, breath);
        this.height = height;
    }

    double volume(){
        return length * breath * height;
    }
}

public class Probleam3{
    public static void main(String[] args) {
        
        cuboid sc = new cuboid(45, 50, 70);
         sc.setBreath(4);
         sc.setHeight(8);
         sc.setLength(5);

         System.out.println(sc.area());
         System.out.println(sc.volume());

    }
}
