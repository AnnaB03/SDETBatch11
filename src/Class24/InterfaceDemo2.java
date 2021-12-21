package Class24;

public interface InterfaceDemo2 {
    default void method1 () {
        System.out.println("I am a default method in Interface");
    }
    static void method2 () {
        System.out.println("I am a static method in Interface");
    }
}
class Test implements InterfaceDemo2 {

}
class Main {
    public static void main(String[] args) {
        InterfaceDemo2.method2(); //works because of static
        //InterfaceDemo2.method1(); not allowed for default methods
        InterfaceDemo2 I1 = new Test();
        I1.method1(); //or
        new Test().method1();
    }
}