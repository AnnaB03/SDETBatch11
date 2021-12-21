package class30;

public class Calculator {
        public  static void doSomething(){
            doMath();
        }
        public static void doMath(){
            divide();
        }
        public static void divide(){
            System.out.println(10/0);
        }
}
