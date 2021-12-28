package class31;

import Utils.ExcelReader;

public class ExceptionDemo8 {
    public static void main(String[] args) {
        System.out.println("Important code");
        ExcelReader.read("Files/ExcelData.xlsx","Sheet1");
        System.out.println("Important code");
    }
}
