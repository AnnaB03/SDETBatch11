package Class26;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList <Fruit> fruit = new ArrayList<>();
      fruit.add(new Banana());
      fruit.add(new Orange());
      for (Fruit f:fruit) {
          f.printName();
      }
    }
}
class Fruit {
    void printName () {
        System.out.println("I am a fruit");
    }
} class Banana extends Fruit {
    void printName () {
        System.out.println("I am banana");
    }
} class Orange extends Fruit {
    void printName () {
        System.out.println("I am an orange");
    }
}