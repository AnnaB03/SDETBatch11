package class30.HW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class homeWork {
    /*Create a property file to store following configurations:
browser=chrome
url=https://facebook.com
username
password
Read file and extract values of browser & url*/
    public static void main(String[] args) throws IOException {
        String path = "Files/Facebook.properties";
        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.get("browser"));
        System.out.println(properties.get("url"));

    }

}
