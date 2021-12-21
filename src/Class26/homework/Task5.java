package Class26.homework;

import Class26.SetDemo1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task5 {
    //How can you remove all duplicates from ArrayList?
    public static void main(String[] args) {
        List<String> aList= new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        Set <String> set = new LinkedHashSet<>(aList); //because Set doesn't allow duplicates - they will be removed
        System.out.println(set);
    }


}
