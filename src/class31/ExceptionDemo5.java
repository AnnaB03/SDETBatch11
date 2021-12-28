package class31;

import java.io.FileInputStream;
import java.util.Locale;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        System.out.println("1");

        try {
            System.out.println("2");
            //  System.out.println(10/0);
            System.out.println("3");
            try {
                int[] arr = new int[-5];
            } catch (Exception er) {
                System.out.println("5");
            }

            System.out.println("4");
            String name = null;
            System.out.println("5");
            name.toLowerCase();
            System.out.println("6");
            FileInputStream fileInputStream = new FileInputStream("dsbfjhs");
        } catch (ArithmeticException e) {
            System.out.println("7");
            //e.printStackTrace();
        } catch (NegativeArraySizeException e) {
            try {
                System.out.println(10 / 0);
            } catch (ArithmeticException er) {
                System.out.println("12");
            }

            System.out.println("8");
            //  e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("9");
            //  e.printStackTrace();
        } catch (Exception Nasir) {
            System.out.println("10");
            // e.printStackTrace();
        }
        System.out.println("11");
    }
}