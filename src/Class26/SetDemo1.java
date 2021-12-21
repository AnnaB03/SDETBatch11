package Class26;

import java.util.HashSet;
import java.util.LinkedList;

public class SetDemo1 {
    public static void main(String[] args) {
        HashSet <String> hashSet = new HashSet<>(); //doesn't print in order,doesn't allow duplicates, faster than LinkedHashSet
        hashSet.add ("Apple");
        hashSet.add ("Mango");
        hashSet.add ("Kiwi");
        hashSet.add ("Apple");
        hashSet.add ("Apple");
        System.out.println(hashSet);

        LinkedList<String> hashSet1 = new LinkedList<>();
        hashSet1.add ("Apple");
        hashSet1.add ("Mango");
        hashSet1.add ("Kiwi");
        hashSet1.add ("Apple");
        hashSet1.add ("Apple");
        System.out.println(hashSet1);

    }
    }

