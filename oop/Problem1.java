
// create a class rectangle ans use inheritance to crete anather class cuboid , real world senario possible .

class rectangle{
    double length;
    double breath;

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

    cuboid(double length, double breath , double height){
        super(length, breath);
        this.height = height;
    }

    double volume(){
        return length * breath * height;
    }
}

public class Problem1 {
    public static void main(String[] args) {
        
        cuboid sc = new cuboid(45, 50, 70);
        System.out.println(sc.area());
        System.out.println(sc.volume());

    }
}
