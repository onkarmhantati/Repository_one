package com.fa.ort.utils;


import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Onkar on 7/11/2017.
 */
public class PropertyFileReader {

    public static Logger logger =Logger.getLogger(PropertyFileReader.class);

    public static Map<String,String> getPropertyData(String fileName){

        Map<String,String> map=null;

        Properties properties;
        InputStream inputStream;
        String filePath;
        try{
            logger.info("Inside getPropertyData Mathod");
            map=new HashMap<>();
            properties=new Properties();
            filePath=System.getProperty("user.dir")+"/"+fileName+".properties";
            inputStream=new FileInputStream(filePath);
            properties.load(inputStream);
            logger.info("Adding data into config map");

            for(int i=0;i<properties.keySet().size();i++){
                //not understand
                map.put(properties.keySet().toArray()[i].toString(),properties.values().toArray()[i].toString());
            }

        }catch (Exception e){
            logger.error(e.getMessage());
        }
        return map;
    }


}
