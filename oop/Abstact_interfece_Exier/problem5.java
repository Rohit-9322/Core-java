//package Abstact_interfece_Exier;



class monkey1{
    void jump1(){
        System.out.println("Jumping .. ");
    }
    void bite1(){
        System.out.println("Bite on monkey ");
    }
}

interface BasicAnimal1{
    void eat();
    void sleep();
}


class human extends monkey1 implements BasicAnimal1{
   
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

public class problem5 {

    public static void main(String[] args) {
        monkey1 pp = new human();
        pp.bite1();
        pp.jump1();
      //  pp.speek();  - > cannot use speek method becuses the refrance is monty which does not spek


      BasicAnimal1 as = new human();
      as.eat();
    }
    
    
}
