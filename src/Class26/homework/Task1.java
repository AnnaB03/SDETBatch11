package Class26.homework;

import java.util.ArrayList;
import java.util.Iterator;
/*Create an arraylist of cars and retrieve all the values using 3 different ways.*/

public class Task1 {
    public static void main(String[] args) {
        ArrayList <String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Tesla");
        cars.add("Mercedes");
        cars.add("Mazda");
        cars.add("Volvo");
        cars.add(1,"Toyota"); //will be added at index num 1
        System.out.println(cars);

        System.out.println("-------------");

            ArrayList <String> cars1 = new ArrayList<>();
            cars1.add("BMW");
            cars1.add("Tesla");
            cars1.add("Mercedes");
            cars1.add("Mazda");
            cars1.add("Volvo");
            for (String i:cars) {
                System.out.print(i + " "); //not recommended, but we can use only to access the element and there's no harm will be done

            }}} class Task1a {

    public static void main(String[] args) {
        System.out.println("-------------");

        ArrayList <String> cars2 = new ArrayList<>();
        cars2.add("BMW");
        cars2.add("Tesla");
        cars2.add("Mercedes");
        cars2.add("Mazda");
        cars2.add("Volvo");
        for (int j = 0; j< cars2.size();j++) {
            System.out.println(cars2.get(j));

            //using while loop
            int i=0;
            while (i<cars2.size()) {
                System.out.println(cars2.get(i));
                i++;
            }
            System.out.println("-------------");
            Iterator<String>iterator = cars2.iterator();
            //hasNext() returns true if there are any elements in Iterator
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }



            }
    }


                }




