package Class26.homework;

import java.util.ArrayList;

public class RemoveE {
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>();
        word.add("word");
        word.add("slide");
        word.add("java");
        word.add("remove");
        //remove the "e" from the words
        for (int i = 0; i < word.size(); i++) {
            String str = word.get(i);
            if (str.toLowerCase().contains("e")) {
                word.set(i,str.replace("e"," "));
            }
        }
        System.out.println(word);

        for (int i=0;i<word.size();i++) {
            String str = word.get(i);
            if (str.toLowerCase().endsWith("e")) {
                word.set(i, str.substring(0,str.length()-1));
            }
        } System.out.println(word);
    }
}