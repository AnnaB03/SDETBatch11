package Class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task5 {
    /*Create a map of Best Buy store. Place item id and item name into it.
    Example (7664847 = Printer, 7879885= TV etc )
    Retrieve all keys and values from a Best Buy map using EntrySet. */

    public static void main(String[] args) {
        HashMap<Integer,String> BestBuy=new HashMap<>();
        BestBuy.put(7664847,"Printer");
        BestBuy.put(7879885,"TV");
        BestBuy.put(7777777,"Laptop");
        BestBuy.put(6666666,"Camera");
        BestBuy.put(5555555,"Radio");

        Set<Map.Entry<Integer, String>> entries = BestBuy.entrySet();
        for(Map.Entry<Integer, String> entry:entries){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("****************************************************");
        Iterator<Map.Entry<Integer, String>> iterator = BestBuy.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> item = iterator.next();
            System.out.println(item.getKey()+" "+item.getValue());
        }
    }
}
