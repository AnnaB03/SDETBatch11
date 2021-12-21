package class30;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo7 {
    public static void main(String[] args) throws IOException {
        //path where we want to create a file
        String path = "C:\\Users\\annab\\Desktop\\syntax\\Batch11Excel\\Test.xlsx";
        //creating the object of XSSWorkbook
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        //creating new sheet inside the file
        XSSFSheet sheet = xssfWorkbook.createSheet("Sheet1");
        //creating new rows inside the sheet
        Row row = sheet.createRow(0);
        //creating new cells inside row 0
        Cell cell = row.createCell(0);
        //setting the data to that newly created cell
        cell.setCellValue("Test");
        //creating the output stream
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        //storing the data to that Excel file
        xssfWorkbook.write(fileOutputStream);



    }
}
