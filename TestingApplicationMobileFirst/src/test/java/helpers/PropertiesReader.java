package helpers;

import java.io.*;
import java.util.Properties;

public class PropertiesReader {

    Properties properties = new Properties();
    InputStream input = null;

    public void dataFileFromConfigProperties() {

        try {
            input = new FileInputStream("C:\\Users\\cmarquez\\Documents\\Mobile_Challenge_Repo\\TestingApplicationMobileChallenge\\src\\test\\resources\\configurations\\config.properties");

            properties.load(input);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            {
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

    public String getValueByKey(String key) throws IOException {
        String KEY = properties.getProperty(key);
        try {
            input = new FileInputStream("C:\\Users\\cmarquez\\Documents\\Mobile_Challenge_Repo\\TestingApplicationMobileChallenge\\src\\test\\resources\\configurations\\config.properties");
            properties.load(input);


        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            {
                if (input != null) {
                    try {
                        input.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }return KEY;
    }
}