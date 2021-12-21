package Class29;

import com.sun.source.tree.Tree;

import java.util.Collection;
import java.util.TreeMap;

public class Task6Tester {
    public static void main(String[] args) {
        TreeMap<Integer,Task6> personTreeMap = new TreeMap<>();
        Task6 person1=new Task6("Rafael","Nadal",34,90000);
        Task6 person2=new Task6("Kimi","Raikkonen",40,100000);
        Task6 person3=new Task6("Roger","Federer",40,110000);
        Task6 person4=new Task6("Leo","Messi",34,120000);
//person1.printUserInfo();

        personTreeMap.put(1,person1);
        personTreeMap.put(20,person2);
        personTreeMap.put(10,person3);
        personTreeMap.put(15,person4);

        Collection<Task6> value = personTreeMap.values();
        for (Task6 values:value) {
            values.printUserInfo();
        }
    }
}
