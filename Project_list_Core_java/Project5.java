package p5;

class shape{
    int dim1, dim2;
    shape(int dim1, int dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    public int getDim1() {
        return dim1;
    }
    public void setDim1(int dim1) {
        this.dim1 = dim1;
    }
    public int getDim2() {
        return dim2;
    }
    public void setDim2(int dim2) {
        this.dim2 = dim2;
    }

    
}


// area of Rectangle
class Rectangle extends shape{
    Rectangle(int dim1, int dim2){
        super(dim1, dim2);
    }
    public int area(){
        return this.dim1 * this.dim2;
    }
}

// area of Square
class Square extends shape{
    Square(int dim1,int dim2){
        super(dim1,-1);
    }
    public int area(){
        return this.dim1 * this.dim1;
    }
}

// area of circle
class circle extends shape{
    circle(int dim1, int dim2){
        super(dim1, -1);
    }
    public double area(){
        return Math.PI * this.dim1 * this.dim1;
    }
}

// area of Cylinder
class Cylinder extends shape{
    Cylinder(int dim1, int dim2){
        super(dim1, dim2);
    }
    public double area(){
        return  2*Math.PI * this.dim1 *( this.dim1 + this.dim2);
    }
}

// area of Sphere
class Sphere  extends shape{
    Sphere(int dim1, int dim2){
        super(dim1, -1);
    }
    public double area(){
        return  4*Math.PI * this.dim1 * this.dim1;
    }
}




public class Project5 {

    public static void main(String[] args) {
        
        //shape obj = new shape(2, 5);

        //Rectangle
        Rectangle r = new Rectangle(10, 5);
        System.out.println("Rectangle Area = " + r.area());


        Square s = new Square(4,0);
        System.out.println("Square = " + s.area());

        circle c = new circle(3,0);
        System.out.println("Circle = " + c.area());

        Cylinder cy = new Cylinder(2,5);
        System.out.println("Cylinder = " + cy.area());

        Sphere sp = new Sphere(3,0);
        System.out.println("Sphere = " + sp.area());



        
    }
    
}
