package Class26;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<String> subject = new ArrayList<>();
        subject.add("SDLC");
        subject.add("Manual Testing");
        Iterator<String> iterator = subject.iterator();

        System.out.println(iterator.hasNext()); //if there are elements in the arraylist
        System.out.println(iterator.next()); //element in the first location
        System.out.println(iterator.hasNext());
        iterator.remove();
        System.out.println(iterator.next());
        iterator.remove();
        //System.out.println(iterator.hasNext());
        //System.out.println(subject.iterator().next());

    }
}