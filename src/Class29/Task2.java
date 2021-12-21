package Class29;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {
    /*Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.*/
    public static void main(String[] args) {
        TreeMap<String,String> capital= new TreeMap<>();
        capital.put("USA","WASHINGTON");
        capital.put("TURKEY", "ANKARA");
        capital.put("FRANCE","PARIS");
        capital.put("ITALY","ROME");
        //System.out.println(capital);

       Set<Map.Entry<String,String>> set = capital.entrySet();
       for (Map.Entry<String,String> entry:set) {
           System.out.println(entry.getKey()+" " +entry.getValue());
       }
       Iterator<Map.Entry<String,String>> iterator = capital.entrySet().iterator();
       while (iterator.hasNext()){
           Map.Entry<String,String> entry = iterator.next();
           System.out.println(entry.getKey()+" "+entry.getValue());
       }
        for (String value:capital.values()) { //to get the values only
            System.out.println(value);
        }

        Iterator<String>valuesIterator=capital.values().iterator(); //to get keys only
        while (valuesIterator.hasNext()) {
            System.out.println(valuesIterator.next());
        }
             {

        }
    }

}
