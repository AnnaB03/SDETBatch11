package Class22;

public class PersonTester {
    public static void main(String[] args) {
        /*Person person = new Teacher("Asghar");
        person.eat();
        person.performDailyTasks();*/

        Person person1 = new Student("Mykl");
        Person [] persons = {new Student("Mykl"),
                new Employee("Farhad"), new Teacher("Asghar")};
        for (Person p2:persons ) {
            p2.performDailyTasks();

            if (p2 instanceof Teacher) {
                ((Teacher)p2).designClasses();
            }
        }
    }
}
