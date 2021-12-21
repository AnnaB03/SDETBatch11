package Class26;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> subject = new ArrayList<>();
        subject.add("SDLC");
        subject.add("Manual Testing");
        subject.add("Java");
        subject.add("Git");
        subject.add("Selenium");
        subject.add("TestNG");

        //System.out.println(subject.get(3));

        //remove all of the elements that have more than 4 chars
        for (int i = 0; i<subject.size();i++) {
            if (subject.get(i).length()>4) {
                subject.remove(i);
            }
        }
        System.out.println(subject);
    }
}
