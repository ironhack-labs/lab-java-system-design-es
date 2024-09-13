package objects;

import utils.Utils;

import java.util.HashMap;
import java.util.Map;

public class Classroom {
  private final HashMap<String, Student> stringStudentHashMap = new HashMap<>();
  private final String[] menuOptions = {"Increase grade", "Show students", "Exit"};

  private final Student studentAccess = new Student();

  public Classroom() {
    initData();
    initClassroom();
  }

  public void initData() {
    stringStudentHashMap.put("daniel", new Student("daniel", 20));
    stringStudentHashMap.put("marcos", new Student("marcos", 40));
    stringStudentHashMap.put("pepe", new Student("pepe", 20));
    stringStudentHashMap.put("carlos", new Student("carlos", 50));
    stringStudentHashMap.put("maria", new Student("maria", 40));
    stringStudentHashMap.put("lucia", new Student("lucia", 70));
    stringStudentHashMap.put("marta", new Student("marta", 80));
  }

  public void initClassroom() {
    int optionSelected;
    do {
      Utils.showInitMenu("Start", menuOptions);
      optionSelected = Utils.retrieveNumberWithMessage();
      if (optionSelected == 0) {
        updateStudentsAndGrades();
        System.out.println("All grades has been updated!");
      } else if (optionSelected == 1) {
        showStudents();
      } else {
        Utils.showMessageIncorrectSelection();
      }
    } while (optionSelected != 2);

  }

  public void showStudents() {
    System.out.println("ALL STUDENTS");
    for (Map.Entry<String, Student> entry : stringStudentHashMap.entrySet()) {
      System.out.println("Student name: " + entry.getKey().toUpperCase() + "\nStudent grade: " + entry.getValue().getGrade() + '\n');
    }
  }

  public void updateStudentsAndGrades() {
    HashMap<String, Student> hashMapUpdated;
    hashMapUpdated = studentAccess.increaseGrades(stringStudentHashMap);
    stringStudentHashMap.replaceAll((k, v) -> hashMapUpdated.get(k));
  }


}
