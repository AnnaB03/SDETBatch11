package Class26.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/*Create an arrayList of words. Remove every word that ends with “e”. */
public class Task2 {
    public static void main(String[] args) {
        ArrayList <String> word = new ArrayList<>();
        word.add("word");
        word.add("slide");
        word.add("java");
        word.add("remove");
        //System.out.println(word.size());

        Iterator <String> iterator = word.iterator();
        while (iterator.hasNext()) {
            String w = iterator.next();
            if (w.toLowerCase().endsWith("e")) {
                iterator.remove();
            }
        }
        System.out.println(word);

        //remove the "e" from the words
        for (int i=0;i<word.size();i++) {
            String str = word.get(i);
            if (str.toLowerCase().contains("e")) {
                word.set(i, str.substring(0,str.length()-2));
            }
        } System.out.println(word);
        /*for (int i = 0; i<word.size();i++) {
            if (word.get(i).endsWith("e")) {
                word.remove(i);
            }
        }
        System.out.println(word);*/



        /*for (String str:word) {
            if (str.endsWith("e")) {
                System.out.println(word.remove());
            }*/
        }

    }

