package Class25.TasksProject;

abstract public class Marks {
    /*We have to calculate the average of marks obtained in three
subjects by student A and by student B. Create class
'Marks' with an abstract method 'getPercentage' that will be
returning the average percentage of marks. Provide implementation
of abstract method in classes 'A' and 'B'. The constructor of student
A takes the marks in three subjects as its parameters and the
marks in four subjects as its parameters for student B. Test your code*/

   abstract double getPercentage ();
   double course1;
   double course2;
   double course3;

    public Marks(double course1, double course2, double course3) {
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }
}
class A extends Marks {

    public A(double course1, double course2, double course3) {
        super(course1, course2, course3);
    }

    @Override
    double getPercentage() {
        return (course1*course2*course3)/3;
    }
}
class B extends Marks {
    double course4;

    public B(double course1, double course2, double course3, double course4) {
        super(course1, course2, course3);
        this.course4 = course4;
    }

    @Override
    double getPercentage() {
        return (course1*course2*course3*course4)/4;
    }
}