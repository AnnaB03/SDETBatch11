package class30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo5 {
    public static void main(String[] args) throws IOException {
        String path = "Files/Config.properties";
        //creating a connection to that file or simply navigating to that file
        FileInputStream fileInputStream = new FileInputStream(path); //we have to use FileInputStream not lose all the that that we entered
        Properties properties = new Properties();
        //loading the data inside properties object from the file
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("password"));
        properties.setProperty("Server","Development");
        //properties.setProperty("URL","www.google.com");
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        //properties.store(fileOutputStream,"Added new property URL");
        properties.store(fileOutputStream,"Added new property Dev");

    }
}
