package Class26;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList<String> subject = new LinkedList<>();
        subject.add("SDLC");
        subject.add("Manual Testing");
        subject.add("Java");
        subject.add("Git");
        subject.add("Selenium");
        subject.add("TestNG");
        System.out.println(subject);
        subject.set(2,"Python"); //changes the object on index #2
        System.out.println(subject);

    }
}