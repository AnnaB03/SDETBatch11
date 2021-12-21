package Class25.CollectionFrameWork;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> subject = new ArrayList<>();
        subject.add("SDLC");
        subject.add("Manual Testing");
        subject.add("Java");
        subject.add("Git");
        subject.add("Selenium");

        ArrayList<String> subject2 = new ArrayList<>();
        subject2.add("TestNG");
        subject2.add("Cucumber");
        subject2.add("SQL");
        subject2.add("APIs");
        subject2.add("Docker");
        subject2.add("AWS");
        subject2.add("Mobile Testing");
        subject2.add("Mock Interview");

        ArrayList<String> subjects = new ArrayList<>();
        subjects.addAll(subject);
        subjects.addAll(2,subject2);
        subject.clear();
        subject2.clear();
        System.out.println(subjects);
        System.out.println(subject);
        System.out.println(subject2);
    }
}
