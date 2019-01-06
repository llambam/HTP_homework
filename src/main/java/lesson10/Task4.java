package lesson10;

import java.util.Set;
import java.util.TreeSet;

import static lesson10.Task2.generateRandomWords;

public class Task4 {
    private Long numberOfStudents;
    private int iterationNumber;


    public void task4() {
        System.out.println("task 4");
        numberOfStudents = 10L;
        iterationNumber = numberOfStudents.intValue();

        Student[] student = new Student[iterationNumber];
        Set<Student> treeSet = new TreeSet<>(new Task4Comparator());
        Student defaultStudent = new Student(0L,"defaultStudent");
        for (int i = 0; i < numberOfStudents; i++) {
            student[i] = new Student(numberOfStudents+i, generateRandomWords());
            treeSet.add(student[i]);
        }


        for (Student s : treeSet) {
            if (s.getStudentID() % 2 == 0) {
                System.out.println(s);
            }else {
                s.setStudentID(0L);
                s.setStudentName("defaultStudent");
            }
        }


        treeSet.removeIf(student1 -> defaultStudent.getStudentName().equalsIgnoreCase(student1.getStudentName()));

        System.out.println("Check:   ");
        for (Student s:treeSet){
            System.out.println(s);
        }
    }


}
