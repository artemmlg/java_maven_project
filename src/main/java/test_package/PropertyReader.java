package test_package;

import java.io.*;
import java.util.*;

public class PropertyReader {

    private String fileSource;

    public PropertyReader(String fileSource) {
        this.fileSource = fileSource;
    }

    public String getProperty(String key) {

        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream(this.fileSource);

            prop.load(input);

            return prop.getProperty(key);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
