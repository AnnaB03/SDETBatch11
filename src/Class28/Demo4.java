package Class28;

import java.util.TreeMap;

public class Demo4 {
    public static void main(String[] args) {
        TreeMap <String,Double> groceriesList1 = new TreeMap<>();
        groceriesList1.put("Eggs",3.99);
        groceriesList1.put("Tomato",3.20);
        //groceriesList1.put("Potato",10); auto conversions doesn't work in wrapper classes
        groceriesList1.put("Potato",10.0);
        groceriesList1.put("Milk",5.0);
        groceriesList1.put("Steak",15.55);

        TreeMap<String,Double> groceriesList2 = new TreeMap<>();
        groceriesList1.put("Soap",20.0);
        groceriesList1.put("Shampoo",13.0);
        groceriesList1.put("Beer",2.00);

        TreeMap<String,Double> groceriesList = new TreeMap<>();
        groceriesList.putAll(groceriesList1);
        groceriesList.putAll(groceriesList2);
        System.out.println(groceriesList);
    }
}
