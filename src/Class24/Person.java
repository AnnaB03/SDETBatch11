package Class24;

public interface Person {
    void eat ();
    void sleep ();
}
interface Employee {
    void work();
}
interface SyntaxEmployees extends Employee, Person {
    void teach();
}
class SDETInstructor implements SyntaxEmployees {
    int age;
    @Override
    public void eat() {
        System.out.println("Syntax Employees eat");
    }

    @Override
    public void sleep() {
        System.out.println("Syntax Employees sleep");
    }

    @Override
    public void work() {
        System.out.println("Creating new repls");
    }

    @Override
    public void teach() {
        System.out.println("Syntax Employees teach");
    }
}