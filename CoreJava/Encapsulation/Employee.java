package CoreJava.Encapsulation;

public class Employee {
    //only want employee class to have access to these variables
    private String name;
    private int age;
    private int id;

    //other classes will have to call these public methods to access above variables
    public Employee(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getId(){
        return this.id;
    }

}
