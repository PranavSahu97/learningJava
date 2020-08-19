package CoreJava.Abstraction;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle("purple", 4, 6);
        Circle c = new Circle("red", 5);

        System.out.println("Rect area: "+r.getArea());
        System.out.println("Circle area: "+c.getArea());

        System.out.println(r.draw());
        System.out.println(c.draw());

        //will not work
       // Shape s = new Shape("yellow");  --> shape is an abstract class. We need to give a specific design

        //will work
        Shape s = new Rectangle("yellow", 9 ,8); // generalization of the concrete class
        System.out.println("Shape area: "+s.getArea());
        System.out.println(s.draw());
    }
}
