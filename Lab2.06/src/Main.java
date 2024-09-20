import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Student> Mapstudent = new HashMap<>();

        Student num1 = new Student(10, "Ana");
        Student num2 = new Student(20, "Williams");
        Student num3 = new Student(35, "Carlos");
        Student num4 = new Student(50, "Maria");

        Mapstudent.put("Ana", num1);
        Mapstudent.put("Williams", num2);
        Mapstudent.put("Carlos", num3);
        Mapstudent.put("Maria", num4);

        num1.increaseGrades(Mapstudent);
        num2.increaseGrades(Mapstudent);
        num3.increaseGrades(Mapstudent);
        num4.increaseGrades(Mapstudent);
    }
}