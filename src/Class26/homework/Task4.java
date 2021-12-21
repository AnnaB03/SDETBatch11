package Class26.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    /*Create an arrayList of even numbers from 1 to 50. Remove any number that is divisible by 5 from that arrayList.*/
    public static void main(String[] args) {
        ArrayList <Integer> num = new ArrayList<>();
        /*num.add(2); num.add(4); num.add(6); num.add(8); num.add(10);
        num.add(12); num.add(14);num.add(16); num.add(18); num.add(20);
        num.add(22); num.add(24);num.add(26); num.add(28); num.add(30);
        num.add(32); num.add(34);num.add(36); num.add(38); num.add(40);
        num.add(42); num.add(44);num.add(46); num.add(48); num.add(50);

        for (int i =0; i<num.size();i++) {
           if (num.get(i)%5==0) {
               num.remove(i);
            }
        }
        System.out.println(num);
*/
        for (int i=2; i<=50; i=i+2) {
            num.add(i);
        }
        System.out.println(num);
        Iterator <Integer> iterator = num.iterator();
        while (iterator.hasNext()) {
            Integer even = iterator.next();
            if (even%5 == 0) {
                iterator.remove();
            }
        }
        System.out.println(num);


    }
}
