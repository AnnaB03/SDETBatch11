package class30;

import Utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelDemo6 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\annab\\IdeaProjects\\SDETBatch11\\Files\\Batch11.xlsx";
        List<Map<String,String>> excelData = ExcelReader.read(path);
        System.out.println(excelData.get(1).get("LastName"));
    }
}
