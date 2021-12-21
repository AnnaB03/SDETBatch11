package Class25.CollectionFrameWork;


import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList <String> subject = new ArrayList<>();
        subject.add("SDLC");
        subject.add("Manual Testing");
        subject.add("Java");
        subject.add("Git");
        subject.add("Selenium");
        subject.add("TestNG");
        subject.add("Cucumber");
        subject.add("SQL");
        subject.add("APIs");
        subject.add("Docker");
        subject.add("AWS");
        subject.add("Mobile Testing");
        subject.add("Mock Interview");
        subject.add("Dead");
        System.out.println(subject.size());
        subject.remove("Dead");
        System.out.println(subject.size());
        System.out.println(subject.indexOf("SQL"));

    }
}
