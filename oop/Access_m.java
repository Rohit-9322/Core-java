package oop;

// Access Modifire 

class empolye{
    private int id;
    private String name;

    void setid(int id){
        this.id = id;
    }

    int getid(){
        return id;
    }

    void setname(String name){
        this.name = name;
    }

    String getname(){
        return name;
    }

}
public class Access_m {
    public static void main(String[] args) {
        empolye e1 = new empolye();
        e1.setid(11);
       System.out.println( e1.getid());

       e1.setname("Mara Bhai");
       System.out.println(e1.getname());
    }
    
}
