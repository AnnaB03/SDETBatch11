package Class29;

import Utils.ConfigReader;

import java.io.IOException;

public class ConfigFileDemo4 {
    public static void main(String[] args) throws IOException {
        System.out.println(ConfigReader.read("Files/Trump.properties","userName"));
    }
}
