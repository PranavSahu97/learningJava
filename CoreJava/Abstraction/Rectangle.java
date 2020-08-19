package CoreJava.Abstraction;

//CONCRETE CLASS
public class Rectangle extends Shape {

    double length;
    double breadth;

    //constructor
    public Rectangle(String color, double length, double breadth){
        //super sets up the shape class whose constructor consists of color
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea(){
        return length * breadth;
    }

    public String draw(){
        return "A " +color + " rectangle " + length + " inches long and " + breadth + " inches wide is drawn";
    }
}
