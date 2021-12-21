package Class26;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {
        ArrayList<String> subject = new ArrayList<>();
        subject.add("SDLC");
        subject.add("Manual Testing");
        subject.add("Java");
        subject.add("Git");
        subject.add("Selenium");
        subject.add("TestNG");

        Iterator <String> iterator = subject.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.length()>4) {
                iterator.remove();
            }
        }
        System.out.println(subject);
    }
}
