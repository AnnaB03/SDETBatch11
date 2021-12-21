package Class29;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task7 {
    /*Create the collection that will store single uniques
    Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.*/
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Cup");
        set.add("Mug");
        set.add("Bottle");
        set.add("Gallon");
        set.add("Bowl");

        StringBuilder values = new StringBuilder();
        for (String str:set
             ) {
            values.append(str);

        }
        System.out.println(values);
        }
    }