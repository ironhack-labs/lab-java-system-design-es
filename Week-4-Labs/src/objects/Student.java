package objects;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class Student {
  private String name;
  private int grade; //0 - 100
  private final BigDecimal gradeIncreasePercentage = new BigDecimal("1.10");

  public Student() {
  }

  public Student(String name, int grade) {
    this.name = name;
    this.grade = grade;
  }

  public String getName() {
    return name;
  }

  public int getGrade() {
    return grade;
  }

  public HashMap<String, Student> increaseGrades(HashMap<String, Student> stringStudentHashMap) {
    int newGrade = Integer.MIN_VALUE;
    BigDecimal bigDecimalToOperate;
    for (Map.Entry<String, Student> entry : stringStudentHashMap.entrySet()) {
      bigDecimalToOperate = new BigDecimal(entry.getValue().grade);
      newGrade = bigDecimalToOperate.multiply(gradeIncreasePercentage).setScale(0, RoundingMode.HALF_UP).intValue();
      entry.setValue(new Student(entry.getValue().getName(), newGrade));
    }
    return stringStudentHashMap;
  }
}
