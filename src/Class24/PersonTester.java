package Class24;

public class PersonTester {
    public static void main(String[] args) {
        Person person = new SDETInstructor();
        person.eat();
        person.sleep();
       /* person.teach();
        person.work();*/

        Employee employee = new SDETInstructor();
        employee.work();

        SyntaxEmployees syntaxEmployees = new SDETInstructor();
        syntaxEmployees.eat();
        syntaxEmployees.sleep();
        syntaxEmployees.teach();
        syntaxEmployees.work();

        SDETInstructor sdetInstructor = new SDETInstructor();
        sdetInstructor.eat();
        sdetInstructor.sleep();
        sdetInstructor.teach();
        sdetInstructor.work();


    }
}
