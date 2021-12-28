package class31;

public class ExceptionDemo9 {
    public static void main(String[] args) {
        System.out.println(10/0);
        try {
            System.out.println("1");
            System.out.println(10/0);
            System.out.println("2");
        } catch (Exception e) {
            System.out.println(10/0);
            System.out.println("3");
        } finally {
            System.out.println("4"); //finally block will only be executed if we enter a try block
        }
    }
}
