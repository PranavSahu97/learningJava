package CoreJava.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Elizabeth", 29, 136762);

        //only way to access name, age, id is to use the public methods in Employee class
        System.out.println(emp.getName());
        System.out.println(emp.getAge());
        System.out.println(emp.getId());

        //won't work

       // emp.age; --> age is a private variable, it cannot be accessed here
       // emp.name;
    }
}

