package Class28;

import java.util.*;

public class Demo9 {
    public static void main(String[] args) {
        HashMap<String, Double> grocery = new LinkedHashMap<>();
        grocery.put("egg", 5.5);
        grocery.put("rice", 4.5);
        grocery.put("milk", 4.3);
        grocery.put("tomato", 4.3);

        System.out.println(grocery);
        Iterator<Map.Entry<String, Double>> iteratr = grocery.entrySet().iterator();

        while (iteratr.hasNext()) {
            Map.Entry<String,Double> entry = iteratr.next();
            if (entry.getKey().equals("milk")&&entry.getValue()==4.3) {
                iteratr.remove();
            }
        }
        System.out.println(grocery);
    }
}