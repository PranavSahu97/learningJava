package CoreJava.Abstraction;

//CONCRETE CLASS
public class Circle extends Shape {
    double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public String draw(){
        return "A " + color + " circle with a " + radius + " inch radius is drawn.";
    }
}
