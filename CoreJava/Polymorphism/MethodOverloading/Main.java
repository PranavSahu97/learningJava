package CoreJava.Polymorphism.MethodOverloading;

public class Main {
    public static void main(String[] args) {
        Operation o = new Operation();
        System.out.println(o.add(2,3));
        System.out.println(o.add(2,3,4));
        System.out.println(o.add(2,3,4,5));
    }
}
