package class31;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        String name=null;
        System.out.println(" line 1");
        try{
            int number1=10;
            int number2=0;
            System.out.println(number1/number2);
            System.out.println(name.length());
        }catch (NullPointerException Mohammad){
            System.out.println("Sending an email to alexey's boss he is not working hard");
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Something is went wrong");
        }

        System.out.println(" line 2");
    }
}


