package class31.reviewClass12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class SetDemo5 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,20,30,30,40,40);
    /*    List<Integer> numbers2=new ArrayList<>();
        numbers.add(10);
        numbers.add(20); // same as numbers
        numbers.add(30);
        numbers.add(30);
        numbers.add(40);
        numbers.add(40);
*/
        numbers=new ArrayList<>(new LinkedHashSet<>(numbers));
        System.out.println(numbers);


    }
}
