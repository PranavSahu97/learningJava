package CoreJava.Inheritance;

public class Main {
    public static void main(String[] args) {
        MathTeacher prof = new MathTeacher(30, "DSHS", 14);
        System.out.println(prof.getRole());

        Teacher tea = new Teacher(40, "Divine");
        System.out.println(tea.numberOfStudents);
        System.out.println(tea.school);

        //will not work
       // System.out.println(tea.favoriteNUmber); --> MathTeacher extends Teacher but Teacher class does not extend MathTeacher so it cannot access this property
    }
}
