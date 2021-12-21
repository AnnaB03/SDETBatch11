package Class25.CollectionFrameWork;

public class Demo3 {
    public static void main(String[] args) {
        int primitiveNumber = 10;
        Integer classNumber = primitiveNumber;
        primitiveNumber = classNumber;
        System.out.println(classNumber);

        Integer number = new Integer(10); //boxing putting a primitive inside a wrapper
        int another = number.intValue(); //auto primitive


    }


}
