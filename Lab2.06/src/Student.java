import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class Student {
    private String name;
    private int grade;



    public Student(int grade, String name) {
        this.grade = grade;
        this.name = name;
    }
    public void increaseGrades (Map<String, Student> Mapstudent){
        System.out.println("Actualizacion de grado de: " + name);
        System.out.println(grade = grade + (grade/10));
    }




    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
}
