package Class26.homework;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        /*Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. */

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Vodka");
        drinks.add("Tekila");
        drinks.add("Bourbon");
        drinks.add("Whiskey");

        //not changing the size of the list and updating the elements so we cant use enhanced for loop
        /*for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.set(i,"Water");

            }
        }
        System.out.println(drinks);*/

        for (int i = 0; i < drinks.size(); i++) {

            if(drinks.get(i).toLowerCase().replaceAll("[aeifdnk]","").length()< drinks.get(i).length()){
                drinks.set(i,"Water");
            }
        }
        System.out.println(drinks);
    }
}
