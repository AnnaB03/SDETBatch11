package class31;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo3 {
    public static void main(String[] args) {

        String path="Files/Trump.properties";
        File file=new File(path);
        if(file.exists()){
            System.out.println("Yes file exists i will not be getting any errors");
            try {
                FileInputStream fileInputStream=new FileInputStream(path);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("File is not present at this path");
        }
        System.out.println("Last line");

    }
}

