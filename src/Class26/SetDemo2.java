package Class26;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class SetDemo2 {
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>(); //prints in order, doesn't allow duplicates,low in performance
        hashSet.add ("Apple");
        hashSet.add ("Mango");
        hashSet.add ("Kiwi");
        hashSet.add ("Apple");
        hashSet.add ("Apple");
        System.out.println(hashSet);
    }
}
