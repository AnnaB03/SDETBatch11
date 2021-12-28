package class31;

import java.util.ArrayList;
import java.util.List;

public class ListOfExeptionsTask {
    public static void main(String[] args) {
       /*
       Create a static method that will return a List of Exceptions.
Inside your method create objects of 4 exception classes using try and catch blocks
 and store them inside your list.
Call your method inside main and print name and
details of all Exception objects.
        */
        for (Exception e : getExceptionList()
        ) {
            e.printStackTrace();
        }

    }

    public static List<Exception> getExceptionList() {
        ArrayList<Exception> list = new ArrayList<>();
        try {
            String name = null;
            name.length();
        } catch (NullPointerException ne) {
            list.add(ne);
        }

        try {
            int[] arr = new int[-5];
        } catch (NegativeArraySizeException e) {
            list.add(e);
        }
        return list;
    }
}