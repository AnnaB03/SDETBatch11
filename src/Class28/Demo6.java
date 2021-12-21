package Class28;

import java.util.*;
import java.util.function.DoublePredicate;

public class Demo6 {
    public static void main(String[] args) {
        HashMap<String, Double> grocery = new LinkedHashMap<>();
        grocery.put("egg", 5.5);
        grocery.put("rice", 4.5);
        grocery.put("milk", 4.3);
        grocery.put("tomato", 6.5);
        System.out.println(grocery);

       /* Iterator<String> keys = grocery.keySet().iterator(); //separated keys from the map - then got a Set and then an iterator
        while (keys.hasNext()) {
            String key = keys.next();
            if (key.contains("e")) {
                keys.remove();
            }
        }
        System.out.println(grocery);
*/
        Iterator<Double> keys1 = grocery.values().iterator(); //separated keys from the map - then got a Set and then an iterator
        while (keys1.hasNext()) {
            Double value = keys1.next();
            if (value.equals(4.3)) {
                keys1.remove();
            }
        }
        System.out.println(grocery);
    }
}