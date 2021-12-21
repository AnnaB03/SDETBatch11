package Class26.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task7 {
    /*Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with "A";
 */
    public static void main(String[] args) {
        Set<String> cities = new LinkedHashSet<>(); //set for order
        cities.add("New York City");
        cities.add("Yonkers");
        cities.add("Rochester");
        cities.add("Albany");
        cities.add("Buffalo");
        System.out.print(cities);

        Iterator <String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            String city = iterator.next();
            if (city.startsWith("A")) {
                iterator.remove();
            }

        }
        System.out.println(cities);
    }

}
