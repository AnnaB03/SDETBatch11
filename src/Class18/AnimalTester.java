package Class18;

public class AnimalTester {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "Bobby";
        dog.bark();
        dog.eat();

        Cat cat = new Cat();
        cat.name = "Lexy";
        cat.meow();

        System.out.println(dog.name);


    }
}
