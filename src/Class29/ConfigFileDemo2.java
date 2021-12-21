package Class29;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo2 {
    public static void main(String[] args) throws IOException {
        String path = "Files/Trump.properties";
        Properties properties = new Properties();
        properties.put("UserName","Asghar123");
        properties.put("Password","Pass123");

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        properties.store(fileOutputStream,"Creating a new file");

    }
}
