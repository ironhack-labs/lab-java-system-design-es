package org.example;

import school.Student;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Crea un Map con una clave del nombre del estudiante (String) y un valor de un objeto Student.
        Map<String, Student> studentMap = new HashMap<>();

        // Crea 4 objetos Student para tus compañeros de clase y agrégalos al Map.
        Student student1 = new Student("Alice", 85);
        Student student2 = new Student("Bob", 92);
        Student student3 = new Student("Charlie", 78);
        Student student4 = new Student("David", 95);

        studentMap.put(student1.getName(), student1);
        studentMap.put(student2.getName(), student2);
        studentMap.put(student3.getName(), student3);
        studentMap.put(student4.getName(), student4);

        // Metodo para aumentar la calificacion de cada estudiante un 10%
        increaseGrades(studentMap);

        // print mapa actualizado
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getGrade());
        }
    }

    public static void increaseGrades(Map<String, Student> studentMap) {
        for (Student student : studentMap.values()) {
            int currentGrade = student.getGrade();
            int increasedGrade = (int) (currentGrade * 1.10);
            student.setGrade(increasedGrade);
        }
    }
}