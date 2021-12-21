package Class25.TasksProject;

import Class25.TasksProject.A;
import Class25.TasksProject.B;
import Class25.TasksProject.Marks;

public class MarksTester {
    public static void main(String[] args) {
        A a = new A(95, 65, 85);
        System.out.println(a.getPercentage());

        B b = new B(85, 67, 89,78);
        System.out.println(b.getPercentage());

        System.out.println("----OR----");

        Marks[] mark = {new A(97, 88, 98), new B(100, 97, 98,89)};
        for (Marks m : mark) {
            System.out.println(m.getPercentage());
        }
    }
}