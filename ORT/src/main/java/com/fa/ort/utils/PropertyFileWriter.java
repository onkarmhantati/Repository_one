package com.fa.ort.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * Created by Onkar on 7/11/2017.
 */
public class PropertyFileWriter {
    String propertyFileName;

    public PropertyFileWriter(String propertyFileName){this.propertyFileName=propertyFileName;}

    public void writeDataToPropertyFile(String key,String value){
        Properties properties;
        FileOutputStream fileOutputStream;
        try {
            properties=new Properties();
            properties.setProperty(key,value);
            fileOutputStream=new FileOutputStream(new File(System.getProperty("user.dir")+"src/test/resources/testData/"+this.propertyFileName+".properties"));
            properties.store(fileOutputStream,"Last visited page url");
            fileOutputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
