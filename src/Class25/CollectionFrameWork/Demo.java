package Class25.CollectionFrameWork;

import java.util.ArrayList;

public class Demo {
    /*
    * Limitations of array:
    * 1. Arrays are fixed in size
    * 2.
    * */
    public static void main(String[] args) {
        String name = "Hasim";
        String name2 = "Ahmet";
        String [] names = {"Maryam", "Amran"};
        //names [2] = "Mohammad"; //can't add more than 2 elements

        ArrayList<String> listOfNames = new ArrayList<>(10); //10 is the size, we can pass the size, but not necessarily
        System.out.println("The size of List of Names is "+ listOfNames.size());
        listOfNames.add("Mustafa");
        listOfNames.add("Anna");
        listOfNames.add("Aysha");
        System.out.println("The size of List of Names is "+ listOfNames.size());
        listOfNames.remove("Aysha");
        System.out.println("The size of List of Names is "+ listOfNames.size());

    }

}
