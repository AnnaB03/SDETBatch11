package Class26.homework;

import java.util.HashSet;
import java.util.Set;

public class StudentTester {
    /*Create a Set collection that will hold Objects of Student Type.
In this set we do not care about the insertion order.
Each student object should have name and studentID.
Display name of each student.*/
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Class26.homework.Student("Alexey", "123"));
        students.add(new Student("Marine","2568"));
        students.add(new Student("Sorbon","7896"));

        for (Student S:students) {
            S.printName();
        }


    }
}
