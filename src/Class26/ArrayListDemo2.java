package Class26;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> subject = new ArrayList<>();
        subject.add("SDLC");
        subject.add("Manual Testing");
        subject.add("Java");
        subject.add("Git");
        subject.add("Selenium");
        subject.add("TestNG");
        subject.add("Cucumber");
        subject.add("SQL");
        subject.add("APIs");

        ArrayList <String> subject2 = new ArrayList<>();

        subject2.add("TestNG");
        subject2.add("Cucumber");
        subject2.add("SQL");
        subject2.add("APIs");
        subject2.add("Docker");
        subject2.add("AWS");
        subject2.add("Mobile Testing");
        subject2.add("Mock Interview");

        subject.retainAll(subject2); // it will keep those elements which are present in both classes.
        System.out.println(subject);

        subject2.retainAll(subject); //same
        System.out.println(subject2);
    }
    }

