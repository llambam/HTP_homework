package lesson10;


import java.util.Comparator;

public class Task4Comparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getStudentID().compareTo(o2.getStudentID());
    }
}
