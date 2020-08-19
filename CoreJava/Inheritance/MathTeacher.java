package CoreJava.Inheritance;

//CHILD CLASS || DERIVED CLASS || SUB CLASS
public class MathTeacher extends Teacher {
    int favoriteNumber;

    public MathTeacher(int numberOfStudents, String school, int favoriteNumber){
        super(numberOfStudents, school);
        this.favoriteNumber = favoriteNumber;
    }
}
