package Test.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by onkar.mhantati on 9/15/2017.
 */
public class PropertieFileReader {

    public static Map<String,String> getPropertiesData(String fileName){
        Map<String,String> map=null;
        Properties properties;
        InputStream inputStream;
        String filePath;

        try {
            map=new HashMap<String, String>();
            properties=new Properties();
            filePath=System.getProperty("user.dir")+"/"+fileName+".properties";
            inputStream =new FileInputStream(filePath);

            for(int i=0;i<properties.keySet().size();i++){
                map.put(properties.keySet().toArray()[i].toString(),properties.values().toArray()[i].toString());
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }
}
