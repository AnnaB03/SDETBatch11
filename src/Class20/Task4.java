package Class20;

public class Task4 {
    /*Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.*/

    private void method () {
        System.out.println("void method");
    }
    private int method (int num) {
        System.out.println("int method");
        return num;
    }
    private int method (String str) {
        System.out.println("int1 method");
        return 5;
    }


    public static void main(String[] args) {
        Task4 task4 = new Task4();
        task4.method(task4.method("kkkkkk"));
    }
}
