package a_class;

/*
Create an interface and generated an interface from it 
*/


interface myInt{
 void display();
}
public class problem2 {
    public static void main(String[] args) {
        myInt i = () -> {System.out.println(" ooh ");};
        i.display();
    }
}
