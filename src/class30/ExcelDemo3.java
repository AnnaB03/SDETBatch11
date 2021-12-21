package class30;

import Utils.ExcelReader;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelDemo3 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\annab\\IdeaProjects\\SDETBatch11\\Files\\Batch11.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1 = xssfWorkbook.getSheet("Sheet1");
        int noOfRows = sheet1.getPhysicalNumberOfRows(); // the number of rows that are not empty
        List<Map<String,String>> excelData=new ArrayList<>();
        System.out.println(noOfRows);
        for (int i = 1; i < noOfRows; i++) {
            XSSFRow row = sheet1.getRow(i);
            LinkedHashMap<String,String> hashMap=new LinkedHashMap<>();
            //int noCells=row.getPhysicalNumberOfCells();
            hashMap.put("FirstName",row.getCell(0).toString());
            hashMap.put("LastName",row.getCell(1).toString());
            hashMap.put("Age",row.getCell(2).toString());
            hashMap.put("City",row.getCell(3).toString());
            excelData.add(hashMap);
        }
        System.out.println(excelData);

    }
    }
