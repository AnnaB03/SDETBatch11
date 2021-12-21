package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    public static String read (String path, String key) throws IOException {
            FileInputStream fileInputStream = new FileInputStream(path);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            return properties.getProperty(key);
    }
    public static String read (String key) throws IOException {
        return read("Files/Config.properties",key);


    }
}
