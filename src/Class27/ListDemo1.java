package Class27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        List<String> students2 = new ArrayList<>();

        /*students.add("Sorbon");
        students2.add("Ahmet");*/

        /*for accessing data use ArrayList
          for manipulating data - LinkedList */
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Tesla");
        cars.add("Mercedes");
        cars.add("Mazda");
        cars.add("Volvo");
        cars.add(1, "Toyota");
        Iterator<String> iterator = cars.iterator();
        //hasNext() returns true if there are any elements in Iterator
        while (iterator.hasNext()) {
            System.out.println(iterator.next());




            }
        }
    }

