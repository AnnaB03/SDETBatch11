package Class28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,50};
        for (int n:numbers) {
            if (n == 100) {
                System.out.println("found");
            }
        }
        ArrayList <Integer> intergerArrayList = new ArrayList<>();
        intergerArrayList.add(30);
        intergerArrayList.add(50);
        intergerArrayList.add(70);
        intergerArrayList.add(90);
        System.out.println(intergerArrayList.contains(70)); //internally contains method is doing the same going through all the elements to search

        Map <Integer,String> studentsInfo = new HashMap<>(); //key,value--one way relation. we can pass key only
        studentsInfo.put(1256,"Alexey");
        studentsInfo.put(4445,"Jimmy");
        System.out.println(studentsInfo.get(4445)); //not going through all the elements


    }
}
