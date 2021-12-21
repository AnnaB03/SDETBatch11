package Class22;

public class Person {
    String name;
    Person (String name) {
        this.name = name;

    } void eat () {
        System.out.println(name + " eats");
    } void performDailyTasks () {
        System.out.println("Eat sleep repeat");
    }
}
class Employee extends Person {
    Employee (String name) {
        super(name);
    } void performDailyTasks () {
        System.out.println("Working all day in the office");
    }
}
class Student extends Person {
    Student (String name) {
        super(name);
    }

    @Override
    void performDailyTasks() {
        System.out.println("Attending classes during the day");
    }
}
 class Teacher extends Person {
    Teacher (String name) {
        super(name);
    }

     @Override
     void performDailyTasks() {
         System.out.println("Giving homework");
     }
     void designClasses () {
         System.out.println("Design classes");
     }


 }
