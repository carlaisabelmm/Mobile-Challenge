package helpers;

import java.io.*;
import java.util.Properties;

public class PropertiesReader {

    public static void loadData()  {

        File file = new File("C:\\Users\\cmarquez\\Documents\\Mobile_Challenge_Repo\\TestingApplicationMobileChallenge\\src\\test\\resources\\configurations\\config.properties");

        FileInputStream fileInputStream = null;

        try{
            fileInputStream = new FileInputStream(file);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        Properties properties = new Properties();

        try{
            properties.load(fileInputStream);
        }catch (IOException e){
            e.printStackTrace();
        }

    }




}

