package Class28;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Demo5 {
    public static void main(String[] args) {
        HashMap<String,Double> grocery = new LinkedHashMap<>();
        grocery.put("egg",5.5);
        grocery.put("rice",4.5);
        grocery.put("milk",4.3);
        grocery.put("tomato",6.5);

        Set <String> keys = grocery.keySet(); //to get keys only keySet - set because keys cannot be duplicated
        System.out.println(keys);
        grocery.values();
        Collection<Double>  values = grocery.values(); //collection because values can be duplicated
        System.out.println(values);
        /* Maps can not have duplicates for keys but it allow duplicates for values */
    }
}
