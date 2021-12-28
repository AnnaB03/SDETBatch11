package class31;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionTask {
    //How would handle InputMismatchException?
    // Input Mismatch Exception when user enters mismatch value then programmer expected.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter Integer Value: ");
            Integer inputInt = scanner.nextInt(); // 2.1
            System.out.println(inputInt);

        }
        catch (InputMismatchException ex) {
            System.out.println("Integer was expected "+ ex);
        }
    }
}

