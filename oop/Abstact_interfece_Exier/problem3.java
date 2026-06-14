package Abstact_interfece_Exier;

// 3} create a class monkey with jump() and bite() method,
//     create a class human which inherites this monkey class and 
//       implement Basicanimal interface with eat() ans sleep() method

class monkey{
    void jump(){
        System.out.println("Jumping .. ");
    }
    void bite(){
        System.out.println("Bite on monkey ");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}


class human extends monkey implements BasicAnimal{
   
  @Override
   public void eat(){
        System.out.println("Human are etting in day 2 time ");
    }
   
 @Override
   public void sleep(){
        System.out.println("Human sleep requrid only 55 hr");
    }

    void speek(){
        System.out.println("That are pekking ");
    }
}


public class problem3 {
    public static void main(String[] args) {
        
        human obj = new human();
        obj.jump();
        obj.bite();

        obj.sleep();
        obj.speek();
    }
    
}
