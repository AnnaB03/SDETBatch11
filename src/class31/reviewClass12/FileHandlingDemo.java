package class31.reviewClass12;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Asghar Nazir\\Desktop\\Memory\\Batch11\\ExcelFile.xlsx";
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(); //class to manipulate excel files
        XSSFSheet sheet = xssfWorkbook.createSheet("Test");
        for (int i = 0; i < 10; i++) {
            Row row=sheet.createRow(i); //Creating 10 rows in the excel file
            for (int j = 0; j < 5; j++) {
                Cell cell= row.createCell(j); //creating 5 cells/Columns in each row
                cell.setCellValue(i*j);
            }
        }

        FileOutputStream fileOutputStream=new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);
    }
}
